package com.task4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    public static void main(String[] args) {
        StrongUser strongUser = new StrongUser();
        strongUser.save("Andriy");
        ApplicationContext context = new ClassPathXmlApplicationContext("contextTask4.xml");
        WeakUser userDB = context.getBean("userDB", WeakUser.class);
        userDB.save("Oleg");
        WeakUser userFile = context.getBean("userFile", WeakUser.class);
        userFile.save("Igor");
    }
}