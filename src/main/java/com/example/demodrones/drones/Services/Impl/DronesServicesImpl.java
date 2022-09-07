package com.example.demodrones.drones.Services.Impl;

import com.example.demodrones.drones.Entity.Drone;
import com.example.demodrones.drones.Model.DronesRequest;
import com.example.demodrones.drones.Model.DronesResponse;
import com.example.demodrones.drones.Repository.DronesRepository;
import com.example.demodrones.drones.Services.DronesServices;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class DronesServicesImpl implements DronesServices {

    DronesRepository dronesRepository;

    @Override
    public DronesResponse AddDrone(Drone dronesRequest) {
        Drone drone = dronesRepository.save(dronesRequest);
        return new DronesResponse(drone.getSerialNumber(),drone.getModel(),drone.getWeight(),drone.getBattery(),drone.getState());
    }

    @Override
    public List<DronesResponse> GetAllDrones() {
        List<Drone> drones = dronesRepository.findAll();
        return drones.stream().map(drone -> new DronesResponse(drone.getSerialNumber(),drone.getModel(),drone.getWeight(),drone.getBattery(),drone.getState())).toList();

    }
}


