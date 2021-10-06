package com.example.multipledatasource.service;

import com.example.multipledatasource.entity.a.A;
import com.example.multipledatasource.entity.a.AC;
import com.example.multipledatasource.entity.b.B;
import com.example.multipledatasource.entity.b.BC;
import com.example.multipledatasource.repository.b.BCDao;
import com.example.multipledatasource.repository.b.BDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BService {
    @Autowired
    private BDao bDao;

    @Autowired
    private BCDao bcDao;

    public int  saveB(A a)
    {
        return bDao.save(new B(a)).getId();
    }

    public void saveBC(AC ac)
    {
        bcDao.save(new BC(ac));
    }


}
