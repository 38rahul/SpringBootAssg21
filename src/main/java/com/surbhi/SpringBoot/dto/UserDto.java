package com.surbhi.SpringBoot.dto;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public
class UserDto {
    private Integer id;
    private String name;
    private String username;
    private String email;
    private String password;
}