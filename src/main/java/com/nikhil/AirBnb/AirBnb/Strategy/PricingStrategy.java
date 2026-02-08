package com.nikhil.AirBnb.AirBnb.Strategy;

import java.math.BigDecimal;

import com.nikhil.AirBnb.AirBnb.Entities.InventoryEntity;
public interface PricingStrategy {

    BigDecimal calculatePrice(InventoryEntity inventory);
}
