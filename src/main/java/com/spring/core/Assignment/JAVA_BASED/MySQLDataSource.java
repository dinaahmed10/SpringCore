package com.spring.core.Assignment.JAVA_BASED;

import org.springframework.stereotype.Component;


public class MySQLDataSource implements DataSource{

    @Override
    public String[] getEmail() {
        String[] Emails= new String[3];
        Emails[0]="ahmed@MySQL.com";
        Emails[1]="montaser@MySQL.com";
        Emails[2]="amir@MySQL.com";
        for(int i=0;i<Emails.length;i++){
            System.out.println( Emails[i] );
        }
        return Emails;
    }
}
