package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 *@version: 1.0
 *@author: lh
 */
@SpringBootApplication
@EnableScheduling
public class SchedulingTasksApplication {
	public static void main(String[] args) {
		SpringApplication.run(SchedulingTasksApplication.class);
	}
}
