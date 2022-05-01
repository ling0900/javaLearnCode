package com.example.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 *@BelongsProject: javaLearnCode
 *@BelongsPackage: com.example.entity
 *@Author: lh
 *@createTime: 2022-05-01  11:56
 *@description: TODO
 *@version: 1.0
 */
@Data
@Component
@ConfigurationProperties("prefix")
public class Person {
	private String name;
	// 这里的字段需要一一对应和yml的配置文件。
	private List<String> likes;
}
