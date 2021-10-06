package com.example.multipledatasource.service;

import com.example.multipledatasource.entity.a.A;
import com.example.multipledatasource.entity.a.AC;
import com.example.multipledatasource.entity.a.AD;
import com.example.multipledatasource.entity.b.B;
import com.example.multipledatasource.entity.b.BC;
import com.example.multipledatasource.entity.b.BD;
import com.example.multipledatasource.repository.b.BCDao;
import com.example.multipledatasource.repository.b.BDDao;
import com.example.multipledatasource.repository.b.BDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BService {
    @Autowired
    private BDao bDao;

    @Autowired
    private BCDao bcDao;

    @Autowired
    private BDDao bdDao;

    public int  saveB(A a)
    {
        B b=new B(a.getName());
        bDao.save(b);
        return b.getId();
    }

    public void saveBC(AC ac)
    {
        BC bc=new BC(ac.getName(),ac.getA_id());
        bcDao.save(bc);
    }

    public void saveBD(AD ad)
    {
        BD bd=new BD(ad.getName(),ad.getA_id());
        bdDao.save(bd);
    }

}
