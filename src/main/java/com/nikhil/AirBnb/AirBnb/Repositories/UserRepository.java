package com.nikhil.AirBnb.AirBnb.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nikhil.AirBnb.AirBnb.Entities.UserEntity;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByEmail(String email);
}
