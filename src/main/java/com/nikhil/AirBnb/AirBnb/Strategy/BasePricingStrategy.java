package com.nikhil.AirBnb.AirBnb.Strategy;

import java.math.BigDecimal;

import com.nikhil.AirBnb.AirBnb.Entities.InventoryEntity;

public class BasePricingStrategy implements PricingStrategy{
    @Override
    public BigDecimal calculatePrice(InventoryEntity inventory) {
        return inventory.getRoom().getBasePrice();
    }
}
