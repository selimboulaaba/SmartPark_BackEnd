package com.example.smartpark.interfaces;

import com.example.smartpark.entities.Towing;

import java.util.List;

public interface TowingInterface {

    public Towing addTowing(Towing towing, long reservationId);
    public void retrieveCar(long towingId);
    public List<Towing> getAllTowings();
    public Towing getTowing(long towingId);
    public List<Towing> getTowingByUser(long userId);
}
