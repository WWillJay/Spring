package com.jay.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class User {


    private String name;

    @Autowired
    private Card card;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showName(){
        System.out.println("name:" + name + " card:" + card.getName());
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
