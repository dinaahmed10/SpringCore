package com.spring.core.Spring_IOC_Container.Java_Based;

public class traveler {

    ////////  هنا بقا مع ال Tight coupling   ////
//   car car=null;
//   public traveler(){
//       this.car=new car();
//   }
//
//   public void startJourney(){
//       this.car.move();
//   }

    //طب لو الtraveler  عايز يروح بال bike  هنغير الكود كله المعتمد على ال car


//    bike bike=null;
//    public traveler(){
//        this.bike=new bike();
//    }
//
//    public void startJourney(){
//        this.bike.move();
//    }


    //طب لو الtraveler  عايز يروح بال cycle  هنغير الكود كله المعتمد على ال bike

//    vehicle
//    cycle cycle=null;
//    public traveler(){
//        this.cycle=new cycle();
//    }
//
//    public void startJourney(){
//        this.cycle.move();
//    }

////////  هنا بقا مع ال loose coupling   ////

    vehicle vehicle;
    public traveler(vehicle vehicle){
        this.vehicle=vehicle;
    }

    public void startJourney(){
        this.vehicle.move();
    }



}
