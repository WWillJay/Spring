package com.jay.old.service;

import com.jay.old.dao.UserDao;
import com.jay.old.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {

    /**
     * 程序控制变量, 程序主动创建对象，控制权在程序员手上，硬编码，一旦需求有变，修改成本较高
     */
//    private UserDao userDao = new UserDaoImpl();

    private UserDao userDao;


    /**
     * 接口控制变量，使用set注入之后，程序不在具有主动性，而是变成被动的接受对象，控制权在于调用者，控制反转的思想，程序员不用再管理对象的创建，降低耦合，可以更加专注于业务
     */
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
