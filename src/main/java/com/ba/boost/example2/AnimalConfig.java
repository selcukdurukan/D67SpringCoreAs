package com.ba.boost.example2;

import org.springframework.context.annotation.Bean;

public class AnimalConfig {

    @Bean(name = "catBean")
    public Cat createCatBean() {
        return new Cat();
    }

    @Bean (name = "dogBean")
    public Dog createDogBean() {
        return new Dog();
    }

    @Bean (name = "petServiceBean")
    public PetService createPetBean() {
        return new PetService(createDogBean());
    }


}
