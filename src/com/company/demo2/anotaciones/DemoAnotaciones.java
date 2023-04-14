package com.company.demo2.anotaciones;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoAnotaciones {
    
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        IinstrumentroMusical instrumento = context.getBean("miGuitarra", IinstrumentroMusical.class);

        System.out.println(instrumento.obtenerSonido());

        context.close();
    }
}