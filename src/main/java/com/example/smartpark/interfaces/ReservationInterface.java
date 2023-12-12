package com.example.smartpark.interfaces;

import com.example.smartpark.entities.Reservation;

import java.util.List;

public interface ReservationInterface {

    public Reservation addReservation(Reservation reservation, long userId, long parkId);
    public Reservation updateTime(long reservationId, long time);
    public List<Reservation> getAllReservations();
    public Reservation getReservation(long reservationId);
    public List<Reservation> getReservationsByUser(long userId);
}
