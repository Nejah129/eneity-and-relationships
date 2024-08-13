package com.example.formation.relation_ship.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "devices")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "device_type")
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "type", length = 31)
    private String type;

    @Column(name = "device_name", length = 255)
    private String deviceName;

}