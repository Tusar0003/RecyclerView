package com.example.no0ne.recyclerview;

/**
 * Created by no0ne on 2/25/18.
 */

public class User {

    private String name;
    private String dept;
    private String account_type;

    public User() {
    }

    public User(String name, String dept, String account_type) {
        this.name = name;
        this.dept = dept;
        this.account_type = account_type;
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

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }
}
