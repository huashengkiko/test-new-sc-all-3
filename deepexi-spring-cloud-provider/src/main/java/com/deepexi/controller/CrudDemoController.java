package com.deepexi.controller;

import com.deepexi.domain.DemoDo;
import com.deepexi.service.CrudDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("demo/mybatis")
@Payload
public class CrudDemoController {
    @Autowired
    private CrudDemoService service;

    @GetMapping("/")
    public List<DemoDo> listAll() {
        return service.listAll();
    }
}
