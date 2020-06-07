package com.jay.config;

import com.jay.pojo.User;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.jay")
@Import(MyConfig2.class)
public class MyConfig {

    @Bean
    public User getUser(){
        User user = new User();
        user.setName("LiLi");
        return user;
    }
}
