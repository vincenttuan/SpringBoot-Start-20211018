package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.one2many.Page;

@Repository
public interface PageRepository extends JpaRepository<Page, Long> {
	
}
