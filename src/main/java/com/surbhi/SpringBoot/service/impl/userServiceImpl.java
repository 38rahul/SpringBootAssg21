package com.surbhi.SpringBoot.service.impl;

import com.surbhi.SpringBoot.dto.UserDto;
import com.surbhi.SpringBoot.entity.User;
import com.surbhi.SpringBoot.mapper.UserMapper;
import com.surbhi.SpringBoot.repository.UserRepo;
import com.surbhi.SpringBoot.service.userService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class userServiceImpl implements userService {

    @Autowired
    private UserRepo userRepo;

    public UserDto addUser(UserDto userDto)
    {

        User user = UserMapper.mapToUser((userDto));
        User saveUser = userRepo.save(user);

        UserDto savedUserDto = UserMapper.mapToUserDto(saveUser);
        return savedUserDto;
    }
}
