package com.example.sql.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.sql.Entitydata.Vehicle;

@Repository
public interface VehicleRepo extends JpaRepository<Vehicle, Long> {
}
