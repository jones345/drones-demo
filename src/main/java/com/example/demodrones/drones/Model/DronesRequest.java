package com.example.demodrones.drones.Model;


import lombok.Data;

@Data
public class DronesRequest {

    private String SerialNumber;


    private String Model;

    private String Weight;


    private String Battery;

    private DroneState State;
}
