package com.example.smartpark.repositories;

import com.example.smartpark.entities.Park;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkRepository extends JpaRepository<Park, Long> {
}
