package com.example.demodrones.drones.Model;

import lombok.AllArgsConstructor;
import lombok.Data;



@Data
@AllArgsConstructor
public class DronesResponse {


    private String SerialNumber;


    private String Model;

    private String Weight;


    private String Battery;

    private DroneState State;
}
