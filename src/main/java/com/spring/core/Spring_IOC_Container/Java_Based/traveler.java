package com.spring.core.Spring_IOC_Container.Java_Based;

public class traveler {

////////  هنا بقا مع ال loose coupling   ////

    vehicle vehicle;
    public traveler(vehicle vehicle){
        this.vehicle=vehicle;
    }

    public void startJourney(){
        this.vehicle.move();
    }
 
}
