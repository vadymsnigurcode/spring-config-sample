package com.example.spting01;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    @Value("${parameter1}")
    String parameter1;
}
