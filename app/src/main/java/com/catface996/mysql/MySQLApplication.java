package com.catface996.mysql;

import com.catface996.common.util.EnvUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

/**
 * @author by catface
 * @date 2020/12/13
 */
@Slf4j
@SpringBootApplication(
				scanBasePackages = {"com.catface996"}
)
public class MySQLApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySQLApplication.class, args);
		log.info("MySQLApplication start success!");
		System.out.println("MySQLApplication start success!");
		System.out.println(EnvUtil.getSwaggerUrl());
		System.out.println(EnvUtil.getDocUrl());
	}
}
