package com.nikhil.AirBnb.AirBnb.Dto;

import com.nikhil.AirBnb.AirBnb.Entities.UserEntity;
import com.nikhil.AirBnb.AirBnb.Enums.Gender;

import lombok.Data;

@Data
public class GuestDTO {
    private Long id;
    private String name;
    private Gender gender;
    private Integer age;
}
