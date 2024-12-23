package com.madhav.redis;

import com.madhav.redis.service.RedisService;
import io.lettuce.core.protocol.Command;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedisApplication implements CommandLineRunner {

	@Autowired
	private RedisService redisService;

	public static void main(String[] args) {
		SpringApplication.run(RedisApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		redisService.save("name","Madhav Aman Srivastava");

		System.out.println(redisService.get("name").toString());

	}
}
