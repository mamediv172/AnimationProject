package com.elbrus.geektechanimation;

import java.io.Serializable;

public class User implements Serializable {

    private String name;
    private String lastName;
    private String imageUrl;
    private int age;


    public User(String name, String lastName, String imageUrl, int age) {
        this.name = name;
        this.lastName = lastName;
        this.imageUrl = imageUrl;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
