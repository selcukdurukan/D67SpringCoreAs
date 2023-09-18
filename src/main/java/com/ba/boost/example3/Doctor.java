package com.ba.boost.example3;

import org.springframework.stereotype.Component;

@Component("doctorBean")
public class Doctor implements Worker {
    @Override
    public void work() {
        System.out.println("Doctor is working...");
    }
}
