package com.example.multipledatasource.controller;

import com.example.multipledatasource.entity.a.A;
import com.example.multipledatasource.entity.a.AC;
import com.example.multipledatasource.entity.a.AD;
import com.example.multipledatasource.service.AService;
import com.example.multipledatasource.service.BService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class controller {
    @Autowired
    private AService aService;

    @Autowired
    private BService bService;

    @PostMapping("/migrate")
    public void migrate()
    {
        List<A> users=aService.getAllA();//1 Neymar ,2 Mbabpe
        for(A a:users)
        {
            int oldId=a.getId();//1 ,2
            int newId=bService.saveB(a); //7 ,8

            //with n thread
            Thread t1=new Thread()
            {
                public void run() {
                    //Save Data after modifying the foreign key
                    List<AC> acs=aService.getAllACById(oldId); // 1 1 PSG ,2 2 PSG
                    for(AC ac:acs)
                    {
                        ac.setA_id(newId); //1 7 PSG ,2 8 PSG
                        bService.saveBC(ac); // 1 7 PSG ,2 8 PSG
                    }
                }
            };

            Thread t2=new Thread()
            {
                public void run() {
                    //Save Data after modifying the foreign key
                    List<AD> ads=aService.getAllADById(oldId); // 1 1 PSG ,2 2 PSG
                    for(AD ad:ads)
                    {
                        ad.setA_id(newId); //1 7 PSG ,2 8 PSG
                        bService.saveBD(ad); // 1 7 PSG ,2 8 PSG
                    }
                }
            };

            t1.start();
            t2.start();
        }
    }


}
