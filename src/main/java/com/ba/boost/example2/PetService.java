package com.ba.boost.example2;

public class PetService {

    private final Animal animal;

    public PetService(Animal animal) {
        this.animal = animal;
    }

    public void sound() {
        animal.sound();
    }
}
