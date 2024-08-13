package com.example.formation.relation_ship.Entity;


import jakarta.persistence.*;

import javax.validation.constraints.Max;
@Entity
@DiscriminatorValue("keyboard")
public class KeyBord  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "capacity" )
    @Max(11)
    private Integer capacity;
    @Column(name = "mode", length = 255)
    private String mode;
}
