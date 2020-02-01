package com.example.demo;

import com.example.demo.beans.EService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class AvoidCrash {

    private final EService eService;

    @Autowired
   public AvoidCrash(@Qualifier("RESTService") EService eService) {
    this.eService = eService;
        eService.call();
   }


}
