package com.jay.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
public class User {
    @Value("aaa")
    private  String name = "xxx";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
