package com.example.demodrones.drones.Repository;

import com.example.demodrones.drones.Entity.Drone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DronesRepository extends JpaRepository<Drone,Long> {
}
