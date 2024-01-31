package com.spring.authentication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/icici")
public class ICICIController {

    @GetMapping("/bankName")
    public String bankName(){
        return "ICICI BANK";
    }
}
