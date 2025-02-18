package com.spring.core.Spring_IOC_Container.Annotation_Based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class clinet {
 public static void main(String[] args) {

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
