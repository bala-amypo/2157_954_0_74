package com.example.sql.Service.impl;

import com.example.sql.Entitydata.Vehicle;
import com.example.sql.Repository.VehicleRepo;
import com.example.sql.Service.VehicleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    VehicleRepo repo;

    @Override
    public Vehicle save(Vehicle v) {

        if (v.getCapacityKg() <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than zero");
        }

        return repo.save(v);
    }

    @Override
    public List<Vehicle> getAll() {
        return repo.findAll();
    }
}
