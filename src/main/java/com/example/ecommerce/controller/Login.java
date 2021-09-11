package com.example.ecommerce.controller;

import com.example.ecommerce.request.LoginRequest;
import com.example.ecommerce.response.LoginResponse;
import com.example.ecommerce.service.LoginService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
public class Login {

    private final LoginService loginService;

    public Login(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping
    public LoginResponse loginResponse(@RequestBody LoginRequest loginRequest){
        return loginService.loginResponse(loginRequest);
    }
}
