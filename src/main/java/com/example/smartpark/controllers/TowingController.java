package com.example.smartpark.controllers;

import com.example.smartpark.entities.Towing;
import com.example.smartpark.interfaces.TowingInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("towing")
public class TowingController {

    @Autowired
    private TowingInterface towingInterface;

    @PostMapping("{reservationId}")
    public Towing addTowing(@RequestBody Towing towing, @PathVariable long reservationId) {
        return towingInterface.addTowing(towing, reservationId);
    }

    @PutMapping("{towingId}")
    public void retrieveCar(@PathVariable long towingId) {
        towingInterface.retrieveCar(towingId);
    }

    @GetMapping
    public List<Towing> getAllTowings() {
        return towingInterface.getAllTowings();
    }

    @GetMapping("{towingId}")
    public Towing getTowing(@PathVariable long towingId) {
        return towingInterface.getTowing(towingId);
    }

    @GetMapping("user/{userId}")
    public List<Towing> getTowingByUser(@PathVariable long userId) {
        return towingInterface.getTowingByUser(userId);
    }
}
