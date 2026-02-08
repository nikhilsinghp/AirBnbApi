package com.nikhil.AirBnb.AirBnb.Dto;

import com.nikhil.AirBnb.AirBnb.Enums.BookingStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingStatusResponseDTO {
    private BookingStatus bookingStatus;
}
