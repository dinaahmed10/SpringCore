package com.spring.core.Spring_IOC_Container.Annotation_Based;


import org.springframework.stereotype.Component;

@Component
public class bike implements vehicle {
    public void move(){
        System.out.println("bike is moving");
    }
}
