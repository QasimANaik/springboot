package com.codingshuttle.module1Introduction;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
//@Service
public class PaymentService {
    public void pay(){

        System.out.println("Paying...");
    }
    @PostConstruct
    public void afterInit(){
        System.out.println("Post");
    }

    @PreDestroy
    public void beforeInitDestroy()
    {
        System.out.println("Pre");

    }


}
