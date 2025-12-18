package com.example.sql.Controller;

import com.example.sql.Entitydata.Vehicle;
import com.example.sql.Service.VehicleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VehicleController {

    @Autowired
    VehicleService service;

    @PostMapping("/vehicles")
    public Vehicle create(@RequestBody Vehicle v) {
        return service.save(v);
    }

    @GetMapping("/vehicles")
    public List<Vehicle> getAll() {
        return service.getAll();
    }
}
