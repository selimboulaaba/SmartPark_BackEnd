package com.example.smartpark.repositories;

import com.example.smartpark.entities.Towing;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TowingRepository extends JpaRepository<Towing, Long> {

    public List<Towing> findByReservationUserUserId(long userId);
}
