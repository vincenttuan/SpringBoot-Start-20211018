package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entity.one2one.Husband;
import com.example.demo.entity.one2one.Wife;
import com.example.demo.repository.HusbandRepository;

@SpringBootApplication
public class One2OneJPATest {
	static ApplicationContext context;
	static HusbandRepository husbandRepository;
	
	public static void main(String[] args) {
		context = SpringApplication.run(One2OneJPATest.class, args);
		husbandRepository = context.getBean(HusbandRepository.class);
		
		//add();
		query();
		
	}
	
	private static void query() {
		List<Husband> husbands = husbandRepository.findAll();
		for(Husband h : husbands) {
			System.out.println(h);
			System.out.println(h.getName());
			System.out.println(h.getWife().getName());
			System.out.println(h.getWife().getHusband().getName());
		}
	}
	
	
	private static void add() {
		
		Wife wife = new Wife();
		wife.setName("Mary");
		
		Husband husband = new Husband();
		husband.setName("John");
		husband.setWife(wife);
		
		husbandRepository.save(husband);
	}

}
