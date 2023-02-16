package com.hiems.user.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
public class UserController {

    @GetMapping("/health-check")
    public String status(){
        LocalDateTime time = LocalDateTime.now(ZoneId.of("Asia/Seoul"));
        return String.format("health-check, time : %s", time);
    }
}
