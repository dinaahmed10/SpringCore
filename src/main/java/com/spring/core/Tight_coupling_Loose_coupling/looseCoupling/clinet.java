package com.spring.core.Tight_coupling_Loose_coupling.looseCoupling;

public class clinet {
 public static void main(String[] args) {
////////  هنا بقا مع ال Tight coupling   ////
//     traveler traveler= new traveler();
//     traveler.startJourney();
     //فى الثلاث حالات لم نغير اى شى هنا ةلكن بنغير الكود كله عناك فى ال traveller


     ////////  هنا بقا مع ال loose coupling   ////
      vehicle vehicle1= new car();  // لو انا عايزخ car

     traveler traveler1= new traveler(vehicle1);
     traveler1.startJourney();

     vehicle vehicle2= new bike();  // لو انا عايزخ bike

     traveler traveler2= new traveler(vehicle2);
     traveler2.startJourney();

     vehicle vehicle3= new cycle();  // لو انا عايزخ cycle

     traveler traveler3= new traveler(vehicle3);
     traveler3.startJourney();



 }
}
