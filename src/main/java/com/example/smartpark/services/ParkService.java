package com.example.smartpark.services;

import com.example.smartpark.entities.Park;
import com.example.smartpark.repositories.ParkRepository;
import com.example.smartpark.interfaces.ParkInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkService implements ParkInterface {

    @Autowired
    private ParkRepository parkRepository;

    @Override
    public List<Park> getAllParks() {
        return parkRepository.findAll();
    }

    @Override
    public Park getPark(long parkId) {
        return parkRepository.findById(parkId).get();
    }

    @Override
    public Park addPark(Park park) {
        return parkRepository.save(park);
    }
}
