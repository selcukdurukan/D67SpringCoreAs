package com.ba.boost.example1;

public class RunService {

    private final Car car;

    public RunService(Car car) {
        this.car = car;
    }

    public void run() {
        car.run();
    }
}
