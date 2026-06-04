package com.task4;

public class StrongUser {
    private Database database = new Database();

    public void save(String name) {
        database.save(name);
    }
}

class Database {
    public void save(String name) {
        System.out.println("The strong user is saved: " + name);
    }
}