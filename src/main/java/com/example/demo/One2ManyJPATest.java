package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entity.one2many.Magazine;
import com.example.demo.entity.one2many.Page;
import com.example.demo.entity.one2one.Husband;
import com.example.demo.entity.one2one.Wife;
import com.example.demo.repository.HusbandRepository;
import com.example.demo.repository.MagazineRepository;
import com.example.demo.repository.PageRepository;

@SpringBootApplication
public class One2ManyJPATest {
	static ApplicationContext context;
	static MagazineRepository magazineRepository;
	static PageRepository pageRepository;
	
	public static void main(String[] args) {
		context = SpringApplication.run(One2ManyJPATest.class, args);
		magazineRepository = context.getBean(MagazineRepository.class);
		pageRepository = context.getBean(PageRepository.class);
		
		add();
	}
	
	public static void add() {
		Magazine magazine = new Magazine();
		magazine.setTitle("Java2");
		// save magazine
		magazineRepository.save(magazine);
		
		// create and save new page
		Page p1 = new Page(10, "catalog", magazine);
		Page p2 = new Page(20, "basic", magazine);
		Page p3 = new Page(30, "object", magazine);
		Page p4 = new Page(40, "Thread", magazine);
		Page p5 = new Page(50, "IO", magazine);
		
		pageRepository.save(p1);
		pageRepository.save(p2);
		pageRepository.save(p3);
		pageRepository.save(p4);
		pageRepository.save(p5);
		
	}
	
	

}
