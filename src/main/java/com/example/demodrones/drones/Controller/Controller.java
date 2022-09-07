package com.example.demodrones.drones.Controller;

import com.example.demodrones.drones.Entity.Drone;
import com.example.demodrones.drones.Model.DronesResponse;
import com.example.demodrones.drones.Services.DronesServices;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/drones")
@AllArgsConstructor
public class Controller {


    DronesServices dronesServices;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @PostMapping("/add")
    public ResponseEntity<DronesResponse> addDrone(Drone dronesRequest) {
        return ResponseEntity.ok(dronesServices.AddDrone(dronesRequest));
    }

    @GetMapping("/get")
    public ResponseEntity<List<DronesResponse>> getAllDrones() {
        return ResponseEntity.ok(dronesServices.GetAllDrones());
    }
}
