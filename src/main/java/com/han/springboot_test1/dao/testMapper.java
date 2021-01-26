package com.han.springboot_test1.dao;

import com.han.springboot_test1.entity.testEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface testMapper {

    public List<testEntity> getUsers() ;
}
