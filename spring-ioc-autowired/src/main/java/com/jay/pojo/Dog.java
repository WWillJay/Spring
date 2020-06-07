package com.jay.pojo;

public class Dog {
    private String name;
    public void bark(){
        System.out.println(this.name + ",吠");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
