package com.example.demo8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyRunner1 implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyRunner1.class);

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("at boot, I will execute, but only once");
    }

    /*@Scheduled(fixedRate = 5000)
    public void guard(){
        LOGGER.info("check safety...will look around");
    }*/

    /*@Scheduled(fixedDelay = 30000)
    public void checkOnceAfterCertainPeriod(){
        LOGGER.info("check whether my bread is ready.....");
    }*/
}
