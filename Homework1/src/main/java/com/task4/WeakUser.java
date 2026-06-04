package com.task4;

public class WeakUser {
    private Storage storage;

    public WeakUser(Storage storage) {
        this.storage = storage;
    }
    public void save(String name){
        storage.save(name);
    }
}