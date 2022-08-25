package com.example.restapi;

import com.example.restapi.model.Message;
import com.example.restapi.repository.MessageRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class RestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApiApplication.class, args);
    }






    @Bean
    public CommandLineRunner importData(

           MessageRepository messageRepository) {

        return (args) -> {
            List<Message> messages = Arrays.asList(
                    new Message("Hello", "fdgfjdgfdgfdkgfdkgjfdkgjkfdgjfdgj"),
                    new Message("Wow", "1212"),
                    new Message("Hello", "fdgfjfdkgjkfdgjfdgj"),
                    new Message("Hello", "fdgfjdgfdgfdkgfdkgjfdkgjkfdgjfdgj"),
                    new Message("Hello", "fdgfjdgfdgfdkgfdkgjfdkgjkfdgjfdgjdfdsfffffffffffffffff"),
                    new Message("Hello", "fdgfj"),
                    new Message("Hello", "fdgfjdgfdgfdkgfdkgjfdkgjkfdgjfdgjdfdsfffffffffffffffff"),
                    new Message("Hello", "fdgfjdgfdgfdkgfdkgjfdkgjkfdgjfdgjdfdsfffffffffffffffff"),
                    new Message("Hello", "fdgfjdgfdgfdkgfdkgjfdkgjkfdgjfdgjdfdsfffffffffffffffff"));

            messageRepository.saveAll(messages);




        };
    }

}
