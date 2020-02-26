package com.moduleTesting.portal.rest.controllers;

import com.moduleTesting.portal.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    @GetMapping("/authenticate")
    public void authenticate(@RequestBody UserDto userDto) {

    }
}