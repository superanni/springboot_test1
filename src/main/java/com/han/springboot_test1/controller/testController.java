package com.han.springboot_test1.controller;

import com.han.springboot_test1.entity.testEntity;
import com.han.springboot_test1.service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class testController {
    @Autowired
    private testService testService;

    @ResponseBody
    @RequestMapping(value = "/testSpringBoot",method = RequestMethod.POST)
    public List<testEntity> testSpringBoot() {

        return testService.geTestUsers();
    }
}
