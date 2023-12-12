package com.example.smartpark.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Reservation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long reservationId;
    @ManyToOne
    User user;
    @ManyToOne
    Park park;
    long time;
    @Temporal(TemporalType.TIMESTAMP)
    Date beginDate;
    boolean towed;
}
