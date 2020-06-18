package com.company.models;

import com.company.enums.Gender;

public abstract class User {
    private String name;
    private int id;
    private Gender gender;

    public User(String name, int age, Gender gender){
        this.name = name;
        this.id = age;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
