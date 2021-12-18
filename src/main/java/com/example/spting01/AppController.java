package com.example.spting01;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Value("${parameter1}")
    String paramOne;

    AppConfiguration appConfiguration;

    public AppController(AppConfiguration appConfiguration) {
        this.appConfiguration = appConfiguration;
    }

    @GetMapping
    public String getEndpoint() {
        return "Hi " + appConfiguration.parameter1;

    }
}
