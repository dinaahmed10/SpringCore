package com.spring.core.Assignment.JAVA_BASED;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class client {
    public static void main(String[] args) {

        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(APPCONFIG.class);
        EmailServices EmailServices=applicationContext.getBean(EmailServices.class);
        EmailServices.sendEmail();

        MySQLDataSource MySQLDataSource=applicationContext.getBean(MySQLDataSource.class);
        MySQLDataSource.getEmail();

        PostgreSQLDataSource PostgreSQLDataSource=applicationContext.getBean( PostgreSQLDataSource.class);
        PostgreSQLDataSource.getEmail();



    }
}
