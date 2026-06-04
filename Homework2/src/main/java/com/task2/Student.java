package com.task2;

public class Student {
    private String name;
    private int age;
    private String group;

    public Student(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void initGroup(){
        this.group = "MT-26";
        System.out.println("Init-method called, group set: " + group);
    }

    public void  showInfo(){
        System.out.println("Student: " + name + ", age: " + age + ", group: " + group);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", group='" + group + '\'' +
                '}';
    }
}