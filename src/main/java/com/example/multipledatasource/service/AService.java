package com.example.multipledatasource.service;

import com.example.multipledatasource.dto.DemoDto;
import com.example.multipledatasource.entity.a.A;
import com.example.multipledatasource.repository.a.ADao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class AService {
    @Autowired
    private ADao aDao;


    public void saveA(A a)
    {
        aDao.save(a);
    }



    public List<DemoDto> getAllByName(String name){
        List<DemoDto> demoDtos=new ArrayList<>();
        for(A a: aDao.getAllByName(name))
        {
            demoDtos.add(new DemoDto(a.getId(),a.getName()));
        }
        return demoDtos;
    }
}
