package com.project.uniqueusers.model;

public class User {
    String name;
    String dept;
    String type;


    public User(String name, String dept, String type) {
        this.name = name;
        this.dept = dept;
        this.type = type;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getDept() {
        return dept;
    }


    public void setDept(String dept) {
        this.dept = dept;
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }
}
