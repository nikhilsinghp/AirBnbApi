package com.nikhil.AirBnb.AirBnb.Service.Interfaces;


import com.nikhil.AirBnb.AirBnb.Entities.BookingEntity;

public interface CheckoutService {

    String getCheckoutSession(BookingEntity booking, String successUrl, String failureUrl);

}
