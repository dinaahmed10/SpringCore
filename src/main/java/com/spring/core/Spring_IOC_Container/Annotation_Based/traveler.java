package com.spring.core.Spring_IOC_Container.Annotation_Based;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class traveler {

     vehicle vehicle;
    @Autowired
    public traveler(@Qualifier("cycle")vehicle vehicle){
        this.vehicle=vehicle;
    }

    public void startJourney(){
        this.vehicle.move();
    }



}
