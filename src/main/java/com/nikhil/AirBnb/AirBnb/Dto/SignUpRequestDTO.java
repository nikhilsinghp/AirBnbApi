package com.nikhil.AirBnb.AirBnb.Dto;

import lombok.Data;

@Data
public class SignUpRequestDTO {
    private String email;
    private String password;
    private String name;
}
