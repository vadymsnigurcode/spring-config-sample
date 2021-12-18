package com.example.spting01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AppService {
    @Value("${parameter1}")
    String parameter1;


    public AppService() {
    }
}
