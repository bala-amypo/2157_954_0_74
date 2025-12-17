package com.example.demo.service.impl;
import java.util.*;
import prg.springframework.stereotype.Service;
import com.example.demo.entity.Studentity;
@Service
public class StudentServiceimpl implements StudentService{
    private final Map<Long.Studentity>
    store=new HashMap<>();
    private long counter=1;
    @Override
    public StudentityinsertStudent(Student st){
        st.setId(counter++);
        store.put(st.getId(),st);
        retrun st;
    }
    
    }
}  