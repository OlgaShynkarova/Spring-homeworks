package com.task2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Student student1 = context.getBean("student1", Student.class);
        student1.showInfo();
        Student student2 = context.getBean("student2", Student.class);
        student2.showInfo();
        System.out.println(context.getBean("studentsMap").toString());
    }
}