package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.one2one.Husband;

@Repository
public interface HusbandRepository extends JpaRepository<Husband, Long> {
	Husband findByName(String name);
}
