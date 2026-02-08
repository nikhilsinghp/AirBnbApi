package com.nikhil.AirBnb.AirBnb.Service.Interfaces;

import com.nikhil.AirBnb.AirBnb.Dto.ProfileUpdateRequestDTO;
import com.nikhil.AirBnb.AirBnb.Dto.UserDTO;
import com.nikhil.AirBnb.AirBnb.Entities.UserEntity;

public interface UserService {
    UserEntity getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDTO profileUpdateRequestDto);

    UserDTO getMyProfile();
}
