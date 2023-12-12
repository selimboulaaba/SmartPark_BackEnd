package com.example.smartpark.services;

import com.example.smartpark.entities.Park;
import com.example.smartpark.entities.Reservation;
import com.example.smartpark.entities.User;
import com.example.smartpark.interfaces.ReservationInterface;
import com.example.smartpark.repositories.ParkRepository;
import com.example.smartpark.repositories.ReservationRepository;
import com.example.smartpark.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationService implements ReservationInterface {

    private ReservationRepository reservationRepository;
    private UserRepository userRepository;
    private ParkRepository parkRepository;

    @Override
    public Reservation addReservation(Reservation reservation, long userId, long parkId) {
        User user = userRepository.findById(userId).get();
        Park park = parkRepository.findById(parkId).get();
        reservation.setUser(user);
        reservation.setPark(park);
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation updateTime(long reservationId, long time) {
        Reservation reservation = getReservation(reservationId);
        reservation.setTime(time);
        return reservationRepository.save(reservation);
    }

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation getReservation(long reservationId) {
        return reservationRepository.findById(reservationId).get();
    }

    @Override
    public List<Reservation> getReservationsByUser(long userId) {
        return reservationRepository.findByUserUserId(userId);
    }
}
