package com.jay.demo2;

public class UserServiceProxy implements UserService {

    private UserServiceImpl service;

    public void setService(UserServiceImpl service) {
        this.service = service;
    }

    public void add() {
        this.log("add()");
        service.add();
    }

    public void delete() {
        this.log("delete()");
        service.delete();
    }

    public void update() {
        this.log("update()");
        service.update();
    }

    public void query() {
        this.log("query()");
        service.query();
    }

    private void log(String msg){
        System.out.println("[debug]:" + msg + "被执行了");
    }
}
