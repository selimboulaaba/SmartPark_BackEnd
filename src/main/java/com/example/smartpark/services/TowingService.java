package com.example.smartpark.services;

import com.example.smartpark.entities.Reservation;
import com.example.smartpark.entities.Towing;
import com.example.smartpark.interfaces.TowingInterface;
import com.example.smartpark.repositories.ReservationRepository;
import com.example.smartpark.repositories.TowingRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TowingService implements TowingInterface {

    private TowingRepository towingRepository;
    private ReservationRepository reservationRepository;

    @Override
    public Towing addTowing(Towing towing, long reservationId) {
        Reservation reservation = reservationRepository.findById(reservationId).get();
        reservation.setTowed(true);
        towing.setReservation(reservationRepository.save(reservation));
        return towingRepository.save(towing);
    }

    @Override
    public void retrieveCar(long towingId) {
        Towing towing = getTowing(towingId);
        towing.setRetrieved(true);
        towingRepository.save(towing);
    }

    @Override
    public List<Towing> getAllTowings() {
        return towingRepository.findAll();
    }

    @Override
    public Towing getTowing(long towingId) {
        return towingRepository.findById(towingId).get();
    }

    @Override
    public List<Towing> getTowingByUser(long userId) {
        return towingRepository.findByReservationUserUserId(userId);
    }
}
