package com.nikhil.AirBnb.AirBnb.Service.Interfaces;

import org.springframework.data.domain.Page;

import com.nikhil.AirBnb.AirBnb.Dto.*;
import com.nikhil.AirBnb.AirBnb.Entities.RoomEntity;

import java.util.List;

public interface InventoryService {
    void initializeRoomForAYear(RoomEntity room);

    void deleteAllInventories(RoomEntity room);

    Page<HotelPriceDTO> searchHotels(HotelSearchRequest hotelSearchRequest);

    List<InventoryDTO> getAllInventoryByRoom(Long roomId);

    void updateInventory(Long roomId, UpdateInventoryRequestDTO updateInventoryRequestDto);
}
