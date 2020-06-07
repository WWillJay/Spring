package com.jay.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class People {
    @Autowired
    private Dog dog;

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
