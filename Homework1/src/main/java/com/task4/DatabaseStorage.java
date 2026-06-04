package com.task4;

public class DatabaseStorage implements Storage{
    @Override
    public void save(String name) {
        System.out.println("The user is saved in the database: " + name);
    }
}