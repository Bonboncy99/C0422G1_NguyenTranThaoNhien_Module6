package com.example.bookstorebe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class BookStoreBeApplication {
@Autowired
private EmailSenderService emailSenderService;
    public static void main(String[] args) {
        SpringApplication.run(BookStoreBeApplication.class, args);
    }

//    @EventListener(ApplicationReadyEvent.class)
//    public void sendMail(){
//        emailSenderService.sendMail("wonwoobon@gmail.com",
//                "Tố cáo","Tố cáo user");
//    }
}
