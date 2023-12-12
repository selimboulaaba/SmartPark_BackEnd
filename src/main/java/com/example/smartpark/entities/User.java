package com.example.smartpark.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long userId;
    String nom;
    String prenom;
    String email;
    String password;
    @Enumerated(EnumType.STRING)
    Role role;
    String matricule;
    String vehicule;
    String cin;
    @OneToMany(mappedBy = "user")
    @JsonIgnore
    List<Reservation> reservationList;
}
