package com.example.demo.services;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Studentity;
@Servicepublic class Studservice{
    private Map<Integer,Studentity>details=new HashMap<>();
    //POST -Add student
    public Studentity saveData(Studentity st){
        details.put(st.getId(),st);
        return st;
    }
    //GET ALL students
    public Collection<Studentity> getAll()
    {
        return details.values();
    }
    //GET sudent by ID
    public Studentity getById(int id){
        return details.get(id);
    }
    //PUT -Update student
    public Studentity update(int id,Studentity st){
        details.put(id,st);
        return st;
    }

}