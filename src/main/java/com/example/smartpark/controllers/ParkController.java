package com.example.smartpark.controllers;

import com.example.smartpark.entities.Park;
import com.example.smartpark.interfaces.ParkInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("park")
public class ParkController {

    @Autowired
    private ParkInterface parkInterface;

    @GetMapping
    public List<Park> getAllParks() {
        return parkInterface.getAllParks();
    }

    @GetMapping("{parkId}")
    public Park getPark(@PathVariable long parkId) {
        return parkInterface.getPark(parkId);
    }

    @PostMapping
    public Park addPark(@RequestBody Park park) {
        return parkInterface.addPark(park);
    }
}
