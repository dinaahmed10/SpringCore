package com.spring.core.Assignment.JAVA_BASED;

import com.spring.core.Assignment.JAVA_BASED.EmailServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.core.Assignment.Annotation_Based")
public class APPCONFIG {


    @Bean
    PostgreSQLDataSource PostgreSQLDataSource(){
        return new PostgreSQLDataSource();
    }

    @Bean
    MySQLDataSource MySQLDataSource(){
        return new MySQLDataSource();
    }

    @Bean
    EmailServices EmailServices(){
        return new EmailServices(PostgreSQLDataSource());
    }
}
