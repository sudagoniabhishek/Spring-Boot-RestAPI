package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	/*	Emp emp1=new Emp(22,"oyiii",55555,"b@gmail.com");
		
		
		 userRespository ur=applicationContext.getBean("userRespository",userRespository.class);
		Emp save=ur.save(emp1);
		java.util.List<Emp> emp11= ur.findAll();
		for(Emp e:emp11) {
			System.out.println(e);
		}
		System.out.println();*/
	}

}
