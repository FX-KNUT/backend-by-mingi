package com.event.backend.repository;

import com.event.backend.dto.FindDto;
import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import javax.sql.rowset.serial.SerialArray;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class FindRepository {
    // 의존성 주입
    private DataSource dataSource;
    public FindRepository(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public List<FindDto> findbrand(String brand) throws SQLException {
        String sql = "select * from cvs where brand = ?";
        ArrayList pr = new ArrayList<String>();
        pr.add(brand);
        int size = pr.size();
        return Connecttoion(pr, size, sql);
    }
    public List<FindDto> findevent(String brand, String event) throws SQLException {
        String sql = "select * from event.cvs where brand = ? and event = ?";

        ArrayList pr = new ArrayList<String>();
        pr.add(brand);
        pr.add(event);
        int size = pr.size();
        return Connecttoion(pr, size, sql);
    }
    public List<FindDto> findname(String brand, String event, String name) throws SQLException {
        String sql = "select * from event.cvs where brand = ? and event = ? and like '% ? %'";

        ArrayList pr = new ArrayList<String>();
        pr.add(brand);
        pr.add(event);
        pr.add(name);
        int size = pr.size();
        return Connecttoion(pr, size, sql);
    }
    public List<FindDto> Connecttoion(ArrayList<String> pr ,int size, String sql)throws SQLException{

        // DB 연결을 위한 객체들
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<FindDto> itemlist = new ArrayList();

        // try-catch문
        try {
            conn = dataSource.getConnection();
            ps = conn.prepareStatement(sql);

            for(int i = 0; i < size; i++) {
                ps.setString(i+1, pr.get(i));
            }
            rs = ps.executeQuery(); // 객체 반환

            while (rs.next()) {

                String Brand = rs.getString("brand");
                String Event  = rs.getString("event");
                String Name = rs.getString("name");
                String Price = rs.getString("price");
                String Img = rs.getString("img");

                FindDto findDto = new FindDto(Brand,Event,Name,Price,Img);
                itemlist.add(findDto);
            }
            return itemlist;
        }
        catch (SQLException e) {
            e.printStackTrace();
        }finally {
            rs.close();
            ps.close();
            conn.close();
        }
        return null;
    }

}

