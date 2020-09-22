package com.example.test2;

import org.springframework.stereotype.Component;

@Component
public class User {
    private String name;
    private int id;

    public User() {
    }

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User name(String name) {
        this.name = name;
        return this;
    }

    public User id(int id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", id='" + getId() + "'" +
            "}";
    }
}
