package com.example.demo.beans;

import org.springframework.stereotype.Component;

@Component
public class RESTService implements EService {
    @Override
    public void call() {
        System.out.println("call RESTExternalService");
    }
}