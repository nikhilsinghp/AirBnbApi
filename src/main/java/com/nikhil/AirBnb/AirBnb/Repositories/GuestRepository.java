package com.nikhil.AirBnb.AirBnb.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nikhil.AirBnb.AirBnb.Dto.GuestDTO;
import com.nikhil.AirBnb.AirBnb.Entities.GuestEntity;
import com.nikhil.AirBnb.AirBnb.Entities.UserEntity;

import java.util.List;

@Repository
public interface GuestRepository extends JpaRepository<GuestEntity, Long> {
    List<GuestDTO> findByUser(UserEntity user);
}