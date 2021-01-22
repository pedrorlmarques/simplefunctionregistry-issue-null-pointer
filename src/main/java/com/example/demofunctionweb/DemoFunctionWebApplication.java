package com.example.demofunctionweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

@SpringBootApplication
public class DemoFunctionWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoFunctionWebApplication.class, args);
    }


    @Bean
    public Function<String, List<Message<?>>> emptyMessageList() {
        return input -> List.of();
    }

    @Bean
    public Function<String, List<String>> emptyStringList() {
        return input -> List.of();
    }

}
