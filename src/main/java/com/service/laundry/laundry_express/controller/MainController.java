package com.service.laundry.laundry_express.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/oauth")
    public String getLogin(){
        return "LoginAuth";
    }
}
