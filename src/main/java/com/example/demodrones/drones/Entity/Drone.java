package com.example.demodrones.drones.Entity;


import com.example.demodrones.drones.Model.DroneState;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@ToString
@Entity
@Table(name = "drones")
public class Drone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name = "serial_number")
    private String SerialNumber;

   @Column(name = "model")
    private String Model;

    @Column(name = "weight")
    private String Weight;

    @Column(name = "battery")
    private String Battery;

    @Column(name = "state")
    private DroneState State;
}
