package com.spring.core.Spring_IOC_Container.Java_Based;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    car car( ){
        return new car();
    }
    @Bean
    bike bike( ){
        return new bike();
    }

    @Bean
    cycle cycle( ){
        return new cycle();
    }
    @Bean
    traveler traveler( ){
        return new traveler(car());
    }


}
