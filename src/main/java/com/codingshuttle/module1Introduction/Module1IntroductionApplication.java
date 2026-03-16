package com.codingshuttle.module1Introduction;

import com.codingshuttle.module1Introduction.impl.EmailNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class Module1IntroductionApplication implements CommandLineRunner {

//	@Autowired
//	PaymentService paymentServiceobj1;
//	@Autowired
//	PaymentService paymentServiceobj2;
//	@Autowired
//	final NotificationService notificationServiceobj;
//
//
//	public Module1IntroductionApplication(NotificationService notificationServiceobj) {
//		this.notificationServiceobj = notificationServiceobj;//Constructor dependecy injection
//	}
@Autowired
Map<String, NotificationService> notificationServiceMap=new HashMap<>();

	public static void main(String[] args) {
		SpringApplication.run(Module1IntroductionApplication.class, args);





	}
	@Override
	public void run(String... args)throws Exception{
//		System.out.println(paymentServiceobj1.hashCode());
//		System.out.println(paymentServiceobj2.hashCode());
//		paymentServiceobj1.pay();
//		paymentServiceobj2.pay();
//		notificationServiceobj.send("Hello");

			for(var notificationService:notificationServiceMap.entrySet()){
				System.out.println(notificationService.getKey());
				notificationService.getValue().send("Hello");
			}




	}



}
