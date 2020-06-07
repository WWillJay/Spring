package com.jay;

import javax.annotation.Resource;

public class School {
    @Resource
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
