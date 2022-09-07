package com.example.demodrones.drones.Services;

import com.example.demodrones.drones.Entity.Drone;
import com.example.demodrones.drones.Model.DronesRequest;
import com.example.demodrones.drones.Model.DronesResponse;

import java.util.List;

public interface DronesServices {


    DronesResponse AddDrone(Drone dronesRequest);

    List<DronesResponse> GetAllDrones();
}
