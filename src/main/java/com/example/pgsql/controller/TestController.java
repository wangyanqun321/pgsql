package com.example.pgsql.controller;

import com.example.pgsql.domain.Stu;
import com.example.pgsql.mapper.StuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    StuMapper stuMapper;

    @GetMapping
    public Stu get(int id){
        System.out.println("test");
        return stuMapper.getStu(id);
    }
}
