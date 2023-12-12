package com.example.smartpark.controllers;

import com.example.smartpark.entities.Reservation;
import com.example.smartpark.interfaces.ReservationInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("reservation")
public class ReservationController {

    @Autowired
    private ReservationInterface reservationInterface;

    @PostMapping("{userId}/{parkId}")
    public Reservation addReservation(@RequestBody Reservation reservation, @PathVariable long userId, @PathVariable long parkId) {
        return reservationInterface.addReservation(reservation, userId, parkId);
    }

    @PutMapping("{reservationId}/{time}")
    public Reservation updateTime(@PathVariable long reservationId, @PathVariable long time) {
        return reservationInterface.updateTime(reservationId, time);
    }

    @GetMapping
    public List<Reservation> getAllReservations() {
        return reservationInterface.getAllReservations();
    }

    @GetMapping("{reservationId}")
    public Reservation getReservation(@PathVariable long reservationId) {
        return reservationInterface.getReservation(reservationId);
    }

    @GetMapping("user/{userId}")
    public List<Reservation> getReservationsByUser(@PathVariable long userId) {
        return reservationInterface.getReservationsByUser(userId);
    }
}
