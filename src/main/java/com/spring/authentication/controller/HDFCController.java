package com.spring.authentication.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hdfc")
public class HDFCController {

    @GetMapping("/name")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public String getBankName(){
        return "HDFC BANK";
    }


    @GetMapping("/address")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String getBankAddress(){
        return "HDFC BANK, HYDERBAD, INDIA";
    }
}
