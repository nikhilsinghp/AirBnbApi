package com.nikhil.AirBnb.AirBnb.Utils;

import org.springframework.security.core.context.SecurityContextHolder;

import com.nikhil.AirBnb.AirBnb.Entities.UserEntity;

public class AppUtils {

    public static UserEntity getCurrentUser() {
        return (UserEntity) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
