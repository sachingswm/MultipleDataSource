package com.example.multipledatasource.service;

import com.example.multipledatasource.entity.a.A;
import com.example.multipledatasource.entity.a.AC;
import com.example.multipledatasource.entity.a.AD;
import com.example.multipledatasource.repository.a.ACDao;
import com.example.multipledatasource.repository.a.ADDao;
import com.example.multipledatasource.repository.a.ADao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AService {
    @Autowired
    private ADao aDao;

    @Autowired
    private ACDao acDao;

    @Autowired
    private ADDao adDao;

    public List<A> getAllA()
    {
        return aDao.findAll();
    }

    public List<AC> getAllAC()
    {
        return acDao.findAll();
    }

    public List<AD> getAllAD()
    {
        return adDao.findAll();
    }

    public List<AC> getAllACById(int id)
    {
        return acDao.getAllByA_id(id);
    }

    public List<AD> getAllADById(int id)
    {
        return adDao.getAllByA_id(id);
    }

}
