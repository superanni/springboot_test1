package com.han.springboot_test1.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class testEntity {
    private String userId;

    private String userName;

    private String sex;

}
