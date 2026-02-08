package com.nikhil.AirBnb.AirBnb.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nikhil.AirBnb.AirBnb.Entities.HotelEntity;
import com.nikhil.AirBnb.AirBnb.Entities.UserEntity;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<HotelEntity,Long> {
    List<HotelEntity> findByOwner(UserEntity user);
}
