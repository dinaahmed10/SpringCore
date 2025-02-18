package com.spring.core.Assignment.Annotation_Based;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class EmailServices {

  private DataSource DataSource;

  @Autowired
    EmailServices(@Qualifier("mySQLDataSource") DataSource DataSource){
        this.DataSource=DataSource;
        System.out.println( "SQL");
    }
   public void sendEmail(){
       DataSource.getEmail();
    }
}
