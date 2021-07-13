package com.example.multipledatasource.controller;

import com.example.multipledatasource.entity.a.A;
import com.example.multipledatasource.entity.b.B;
import com.example.multipledatasource.service.AService;
import com.example.multipledatasource.service.BService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @Autowired
    private AService aService;

    @Autowired
    private BService bService;

    @PostMapping("/saveA")
    public void saveA(@RequestBody A a)
    {
        aService.saveA(a);
    }

    @PostMapping("/saveB")
    public void saveB(@RequestBody B b)
    {
        bService.saveB(b);
    }
}
