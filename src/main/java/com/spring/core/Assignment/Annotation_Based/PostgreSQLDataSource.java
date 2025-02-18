package com.spring.core.Assignment.Annotation_Based;


import org.springframework.stereotype.Component;

@Component
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
