package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entity.one2one.Husband;
import com.example.demo.entity.one2one.Wife;
import com.example.demo.repository.HusbandRepository;

@SpringBootApplication
public class One2OneJPATest {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(One2OneJPATest.class, args);
		HusbandRepository husbandRepository = context.getBean(HusbandRepository.class);
		
		Wife wife = new Wife();
		wife.setName("Mary");
		
		Husband husband = new Husband();
		husband.setName("John");
		husband.setWife(wife);
		
		husbandRepository.save(husband);
	}

}
