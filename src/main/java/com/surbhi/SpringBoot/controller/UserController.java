package com.surbhi.SpringBoot.controller;

import com.surbhi.SpringBoot.dto.UserDto;
import com.surbhi.SpringBoot.service.userService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/users")
@AllArgsConstructor


public class UserController {

    @Autowired
    private userService userservice;

    @PostMapping("/addUser")
    public ResponseEntity<UserDto> addUser(@RequestBody UserDto userDto){

        UserDto savedUser = userservice.addUser(userDto);

        return  new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
}
