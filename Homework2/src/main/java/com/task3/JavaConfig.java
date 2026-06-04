package com.task3;

import com.task2.Student;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class JavaConfig {
    @Bean(initMethod = "initGroup")
    public Student student1(){
        Student student1 = new Student("Petro");
        student1.setAge(20);
        return student1;
    }

    @Bean(initMethod = "initGroup")
    public Student student2(){
        Student student2 = new Student("Petro");
        student2.setAge(20);
        return student2;
    }

    @Bean
    public Map<String, Student> studentsMap(ListableBeanFactory beanFactory){
        Map<String, Student> resultMap = new HashMap<>();
        Map<String, Student> springBeans = beanFactory.getBeansOfType(Student.class);
        resultMap.putAll(springBeans);
        return resultMap;
    }
}