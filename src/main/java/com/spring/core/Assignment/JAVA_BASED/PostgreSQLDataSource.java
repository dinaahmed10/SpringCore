package com.spring.core.Assignment.JAVA_BASED;


import org.springframework.stereotype.Component;


public class PostgreSQLDataSource implements DataSource{
    @Override
    public String[] getEmail() {
        String[] Emails= new String[3];
        Emails[0]="ali@Postgre.com";
        Emails[1]="mohamed@Postgre.com";
        Emails[2]="ahmed@Postgre.com";
        for(int i=0;i<Emails.length;i++){
            System.out.println( Emails[i] );
        }
        return Emails;
    }
}
