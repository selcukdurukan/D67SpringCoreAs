package com.ba.boost.example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnimalConfig.class);

        PetService petService = applicationContext.getBean("petServiceBean", PetService.class);

        petService.sound();
    }

}
