package com.luv2code.springboot.demo.myapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class FunRestController   {
    //expose a "/" endpoint that returns "Hello World"
    @Value("${owner.name}")
    private String ownerName;
    @GetMapping("/")
    public String sayHello(){
        return "Hello World " + ownerName;
    }
    // expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Pretend to run a 5k";
    }
    // expose a new endpoint for "fortune"
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Good Luck!";
    }
}
