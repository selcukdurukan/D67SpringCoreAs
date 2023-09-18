package com.ba.boost.example3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(WorkerConfig.class);

        WorkerService service = applicationContext.getBean("workerServiceBean", WorkerService.class);

        service.work();
    }
}
