package com.spring.core.Assignment.Annotation_Based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class client {
    public static void main(String[] args) {

        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(APPCONFIG.class);
        EmailServices EmailServices=applicationContext.getBean(EmailServices.class);
        EmailServices.sendEmail();

        MySQLDataSource MySQLDataSource=applicationContext.getBean(com.spring.core.Assignment.Annotation_Based.MySQLDataSource.class);
        MySQLDataSource.getEmail();

        PostgreSQLDataSource PostgreSQLDataSource=applicationContext.getBean(com.spring.core.Assignment.Annotation_Based.PostgreSQLDataSource.class);
        PostgreSQLDataSource.getEmail();



    }
}
