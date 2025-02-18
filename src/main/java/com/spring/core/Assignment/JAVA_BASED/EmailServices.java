package com.spring.core.Assignment.JAVA_BASED;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



public class EmailServices {

  private DataSource DataSource;


    EmailServices(DataSource DataSource){
        this.DataSource=DataSource;
    }
   public void sendEmail(){
       DataSource.getEmail();
    }
}
