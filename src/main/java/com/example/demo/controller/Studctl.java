package com.example.demo.controller;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Studentity;
import com.example.demo.services.Studservice;
@RestController
@RequestMapping("/student")
public class Studctl {
    @Autowired
    private Studservice ser;

    //POST
    @PoastMapping("/add")
    public Studentity addStudent(@RequestBody Studentity st){
        return ser.saveData(st);
    }

    //GET ALL
    @GetMapping("/getall")
    public Collection<Studentity> getAllStudents(){
        return ser.getAll();
    }

    //GEF BY ID
    @GetMapping("/get/{id}")
    public Studentity getStudentById(@PathVariable int id){
        return ser.getById(id);
    }

    //PUT (UPDATE)
    @PutMapping("/update/{id}")
    public Studentity updateStudent(
        @PathVariable int id,
        @RequestBody Studentity st{
            return ser.update(id,st);
        }
    
    }
    
    
