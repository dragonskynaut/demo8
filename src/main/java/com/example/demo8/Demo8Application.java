package com.example.demo8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@SpringBootApplication
public class Demo8Application {
	private static final Logger LOGGER = LoggerFactory.getLogger(MyRunner1.class);
	public static void main(String[] args) {
		SpringApplication.run(Demo8Application.class, args);
	}

	/*@Scheduled(fixedRate = 4000)
	public void checkDiskUsage(){
		LOGGER.info("check disk usage...");
	}*/

	// 秒 分 時 日 月 週
	@Scheduled(cron = "*/5 * * * * *")
	public void checkWithSkill(){
		LOGGER.info("what is this?...");
	}

}
