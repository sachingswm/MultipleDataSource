package com.example.multipledatasource.service;

import com.example.multipledatasource.entity.b.B;
import com.example.multipledatasource.repository.b.BDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BService {
    @Autowired
    private BDao bDao;

    public void saveB(B b)
    {
        bDao.save(b);
    }
}
