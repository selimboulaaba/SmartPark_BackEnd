package com.example.smartpark.interfaces;

import com.example.smartpark.entities.Park;

import java.util.List;

public interface ParkInterface {

    public List<Park> getAllParks();
    public Park getPark(long parkId);
    public Park addPark(Park park);
}
