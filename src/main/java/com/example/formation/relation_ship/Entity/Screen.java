package com.example.formation.relation_ship.Entity;

import jakarta.persistence.*;

import javax.validation.constraints.Max;

@Entity
@DiscriminatorValue("screen")

public class Screen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "resoluation" )
    @Max(11)
    private Integer resoluation;
    @Column(name = "quality", length = 255)
    private String quality;

}
