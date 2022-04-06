package com.event.backend.database;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import javax.sql.DataSource;

@Configuration
public class Config implements WebMvcConfigurer {
    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");
        dataSourceBuilder.url("jdbc:mysql://event.cdjb7q86vnre.ap-northeast-2.rds.amazonaws.com:3306/event");
        dataSourceBuilder.username("admin");
        dataSourceBuilder.password("19991003");
        return dataSourceBuilder.build();
    }
}