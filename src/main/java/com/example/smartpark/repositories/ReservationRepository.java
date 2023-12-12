package com.example.smartpark.repositories;

import com.example.smartpark.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    public List<Reservation> findByUserUserId(long userId);
}
