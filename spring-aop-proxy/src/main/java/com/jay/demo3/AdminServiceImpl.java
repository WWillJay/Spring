package com.jay.demo3;

public class AdminServiceImpl implements AdminServiceInterface {

    public void add() {
        System.out.println("执行添加操作");
    }

    public void delete() {
        System.out.println("执行了删除操作");
    }

    public void update() {
        System.out.println("执行了更新操作");
    }

    public void query() {
        System.out.println("执行了查询操作");
    }
}
