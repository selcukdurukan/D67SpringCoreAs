package com.ba.boost.example3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("workerServiceBean")
public class WorkerService {

    @Autowired
    @Qualifier("nurseBean")
    private Worker worker;


    /**
     *      METHOD 1
     *    public WorkerService(@Qualifier("nurseBean") Worker worker) {
     *       this.worker = worker;
     *     }
     *
     *
     *
     * */


    public void work() {
        worker.work();
    }
}
