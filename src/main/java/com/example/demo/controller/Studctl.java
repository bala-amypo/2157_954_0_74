package com.example.demo.controller;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Studentity;
import com.example.demo.services.Studservice;
@RestController
@RequestMapping("/student")
public class Studctl{
    @@Autowiredprivate Studservice ser;
    @PoastMapping("/add")
    public Studentity addStudentity(@RequestBody Studentity st){
        return ser.saveData(st);
    }
    @GetMapping(/"getall")
    public Collection<Studentity> getAllStudent(){
        return ser.getAll();
    }
    @GetMapping("/get/{id}")
    public Studentity getStudentByid(@PathVariable int id){
        return ser.getByid(id);
    }
    @PutMapping("/update/{id}")
    public Studentity updateStudent(
        @PathVariable int id,
        @RequestBody Studentity st{
            return ser.update(id,sr);
        }
    
    }
    
    
