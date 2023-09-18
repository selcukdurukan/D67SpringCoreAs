package com.ba.boost.example3;

import org.springframework.stereotype.Component;

@Component("nurseBean")
public class Nurse implements Worker {
    @Override
    public void work() {
        System.out.println("Nurse is working...");
    }
}
