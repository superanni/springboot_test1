package com.han.springboot_test1.service.impl;

import com.han.springboot_test1.entity.testEntity;
import com.han.springboot_test1.dao.testMapper;
import com.han.springboot_test1.service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class testServiceImpl implements testService {
    @Autowired
    private testMapper testMapper;

    @Override
    public List<testEntity> geTestUsers() {
        return testMapper.getUsers();
    }
}
