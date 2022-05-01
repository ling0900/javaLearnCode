package com.example.schedulingtasks;


import java.text.SimpleDateFormat;
import java.util.Date;

import com.example.entity.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 *@BelongsProject: javaLearnCode
 *@BelongsPackage: com.example.schedulingtasks
 *@Author: lh
 *@CreateTime: 2022-05-01  11:11
 *@Description: TODO
 *@Version: 1.0
 */
@Component
public class ScheduledTasks {
	@Autowired
	private Person person;
	
	private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);
	
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate = 5000)
	public void reportCurrentTime() {
		log.info("The time is now {}", dateFormat.format(new Date()));
		log.info("The time is now {}", person.toString());
	}
}
