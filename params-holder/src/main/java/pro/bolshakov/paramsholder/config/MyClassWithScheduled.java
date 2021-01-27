package pro.bolshakov.paramsholder.config;

import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalTime;

public class MyClassWithScheduled {

    @Scheduled(fixedDelayString = "${schedule.delay}")
    public void scheduled(){
        System.out.println("Schedule inherit " + LocalTime.now());
    }

}
