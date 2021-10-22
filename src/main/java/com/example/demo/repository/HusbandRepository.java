package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.one2one.Husband;

@Repository
public interface HusbandRepository extends JpaRepository<Husband, Long> {
	// 配合 Husband.java name 欄位設定 unique = true
	Husband findByName(String name);
}
