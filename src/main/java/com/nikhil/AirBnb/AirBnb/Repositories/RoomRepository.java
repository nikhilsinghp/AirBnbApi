package com.nikhil.AirBnb.AirBnb.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nikhil.AirBnb.AirBnb.Entities.RoomEntity;

@Repository
public interface RoomRepository extends JpaRepository<RoomEntity,Long> {
}
