package com.surbhi.SpringBoot.mapper;

import com.surbhi.SpringBoot.dto.UserDto;
import com.surbhi.SpringBoot.entity.User;

public class UserMapper {
    public static User mapToUser(UserDto userDto){

        User user = new User(
                userDto.getId(),
                userDto.getEmail(),
                userDto.getName(),
                userDto.getUsername(),
                userDto.getPassword()
        );
        return  user;
    }

    public static UserDto mapToUserDto(User user){
        UserDto userDto = new UserDto(
                user.getId(),
                user.getName(),
                user.getUsername(),
                user.getPassword(),
                user.getEmail()
        );
        return  userDto;
    }
}

