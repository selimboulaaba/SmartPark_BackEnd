package com.example.smartpark.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Towing implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long towingId;
    @OneToOne
    Reservation reservation;
    boolean retrieved;
    @Enumerated(EnumType.STRING)
    TowingType type;
}
