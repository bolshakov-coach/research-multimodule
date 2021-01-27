package pro.bolshakov.paramsholder.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalTime;
import java.util.UUID;

public abstract class AbstractMyClass {

    @Value("${values.test:default}")
    private String testValue;

    public String getTestValue() {
        return testValue;
    }

//    @Scheduled(fixedDelayString = "${schedule.delay}")
    public void scheduled(){
        System.out.println("Schedule " + LocalTime.now());
    }

    @Bean
    public MyClassWithScheduled myClassWithScheduled(){
        return new MyClassWithScheduled();
    }

    @Async
    public void runAsyncMethod(UUID uuid){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Execution of async method. Input uuid -> " + uuid.toString());
    }
}
