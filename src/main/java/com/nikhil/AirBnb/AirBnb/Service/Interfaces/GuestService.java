package com.nikhil.AirBnb.AirBnb.Service.Interfaces;



import java.util.List;

import com.nikhil.AirBnb.AirBnb.Dto.GuestDTO;

public interface GuestService {

    List<GuestDTO> getAllGuests();

    void updateGuest(Long guestId, GuestDTO guestDto);

    void deleteGuest(Long guestId);

    GuestDTO addNewGuest(GuestDTO guestDto);
}
