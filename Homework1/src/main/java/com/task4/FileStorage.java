package com.task4;

public class FileStorage implements Storage{
    @Override
    public void save(String name) {
        System.out.println("The user is saved in the file: " + name);
    }
}