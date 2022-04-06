package com.event.backend.repository;

import com.event.backend.dto.FindDto;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;
import java.util.Optional;

@Repository
public class FindRepository {

    // 의존성 주입
    private DataSource dataSource;
    public FindRepository(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public Optional<FindDto> findname(String brand, String event) throws SQLException {
        String sql = "SELECT * FROM event.cvs WHERE brand = ? AND event = ?";
        // DB 연결을 위한 객체들
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        FindDto findDto = new FindDto();
        // try-catch문
        try {
            conn = dataSource.getConnection();
            ps = conn.prepareStatement(sql);

            ps.setString(1, brand); // sql문에 1번쨰 ?에 brand 넣기
            ps.setString(2,event); // sql문에 2번째 ?에 price 넣기
           // ps.setString(3,name); // sql문에 3번째 ?에 name 넣기

            rs = ps.executeQuery(); // 객체 반환

            while (rs.next()) {
                findDto.setBrand(rs.getString("brand"));
                findDto.setEvent(rs.getString("event"));
                findDto.setName(rs.getString("name"));
                findDto.setPrice(rs.getString("price"));
                findDto.setImg(rs.getString("img"));

                return Optional.of(findDto);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }finally {
            rs.close();
            ps.close();
            conn.close();
        }
        return Optional.empty();
    }
}

