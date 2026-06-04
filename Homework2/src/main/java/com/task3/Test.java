package com.task3;

import com.task2.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Student student1 = context.getBean("student1", Student.class);
        student1.showInfo();
        Student student2 = context.getBean("student2", Student.class);
        student2.showInfo();
        System.out.println(context.getBean("studentsMap"));
    }
}