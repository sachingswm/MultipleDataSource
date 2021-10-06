package com.example.multipledatasource.controller;

import com.example.multipledatasource.entity.a.A;
import com.example.multipledatasource.entity.a.AC;
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
        List<A> users=aService.getAllA();
        for(A a:users)
        {
            int oldId=a.getId();
            int newId=bService.saveB(a);
            //with n thread
//            Thread t=new Thread()
//            {
//                public void run() {
//                    //Save Data after modifying the foreign key
//                    List<AC> acs=aService.getAllACById(oldId);
//                    for(AC ac:acs)
//                    {
//                        ac.setA_id(newId);
//                        bService.saveBC(ac);
//                    }
//                }
//            };
//            t.start();
        }
    }


}
