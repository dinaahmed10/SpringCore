package com.spring.core.Spring_IOC_Container.Java_Based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class clinet {
 public static void main(String[] args) {
////////  هنا بقا مع ال Tight coupling   ////
//     traveler traveler= new traveler();
//     traveler.startJourney();
     //فى الثلاث حالات لم نغير اى شى هنا ةلكن بنغير الكود كله عناك فى ال traveller


     ////////  هنا بقا مع ال loose coupling   ////

//      vehicle vehicle1= new car();  // لو انا عايزخ car
//
//     traveler traveler1= new traveler(vehicle1);
//     traveler1.startJourney();
//
//     vehicle vehicle2= new bike();  // لو انا عايزخ bike
//
//     traveler traveler2= new traveler(vehicle2);
//     traveler2.startJourney();
//
//     vehicle vehicle3= new cycle();  // لو انا عايزخ cycle
//
//     traveler traveler3= new traveler(vehicle3);
//     traveler3.startJourney();


     ///// هنا بقا ال spring ioc contanir المسوول عن  انشاء ال java beans و ادارتها

     ApplicationContext ApplicationContext= new AnnotationConfigApplicationContext(AppConfig.class);

     traveler traveler=ApplicationContext.getBean(traveler.class);
     traveler.startJourney();
     car car=ApplicationContext.getBean(car.class);
     car.move();
     bike bike=ApplicationContext.getBean(bike.class);
     bike.move();
     cycle cycle=ApplicationContext.getBean(cycle.class);
     cycle.move();





 }
}
