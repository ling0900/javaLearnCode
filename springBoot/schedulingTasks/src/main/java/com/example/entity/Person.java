package com.example.entity;/**
 * @Author lhMeng
 * @Create 2022-05-01-11:56
 * @Describe
 */

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@BelongsProject: javaLearnCode
 *@BelongsPackage: com.example.entity
 *@Author: lh
 *@CreateTime: 2022-05-01  11:56
 *@Description: TODO
 *@Version: 1.0
 */
@Data
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
	private String name;
	// 这里的字段需要一一对应和yml的配置文件。
	private List<String> likes;
}
