package com.task2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("contextTask2.xml");
        Quest quest1 = context.getBean("dragonQuest", Quest.class);
        Quest quest2 = context.getBean("rescuePrincessQuest", Quest.class);
        Knight knight1 = new Knight(quest1);
        knight1.embarkOnQuest();
        Knight knight2 = new Knight(quest2);
        knight2.embarkOnQuest();
    }
}