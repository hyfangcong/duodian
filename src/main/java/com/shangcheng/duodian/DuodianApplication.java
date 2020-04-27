package com.shangcheng.duodian;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class DuodianApplication {

	public static void main(String[] args) {
		SpringApplication.run(DuodianApplication.class, args);
	}


	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
		return args -> {
			System.out.println("Let's inspect the beans provided by spring boot");
			String[] beanName = ctx.getBeanDefinitionNames();
			Arrays.sort(beanName);
			for(String s : beanName){
				System.out.println(s);
			}
		};
	}
}
