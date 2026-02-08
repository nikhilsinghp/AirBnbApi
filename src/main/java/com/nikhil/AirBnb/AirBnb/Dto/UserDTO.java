package com.nikhil.AirBnb.AirBnb.Dto;

import lombok.Data;

import java.time.LocalDate;

import com.nikhil.AirBnb.AirBnb.Enums.Gender;

@Data
public class UserDTO {
    private Long id;
    private String email;
    private String name;
    private Gender gender;
    private LocalDate dateOfBirth;
}
