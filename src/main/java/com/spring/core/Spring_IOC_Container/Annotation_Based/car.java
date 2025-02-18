package com.spring.core.Spring_IOC_Container.Annotation_Based;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class car implements vehicle {
   public void move(){
       System.out.println("Car is moving");
   }
}
