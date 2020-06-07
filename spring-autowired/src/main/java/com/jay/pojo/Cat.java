package com.jay.pojo;

public class Cat {
    private String name;
    public void eat(){
        System.out.println(name + ",吃猫粮");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
