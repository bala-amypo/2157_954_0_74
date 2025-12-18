package com.example.sql.Service;

import com.example.sql.Entitydata.Vehicle;
import java.util.List;

public interface VehicleService {
    Vehicle save(Vehicle v);
    List<Vehicle> getAll();
}
