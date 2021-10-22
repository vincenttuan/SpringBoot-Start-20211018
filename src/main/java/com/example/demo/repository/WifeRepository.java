package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.one2one.Wife;

@Repository
public interface WifeRepository extends JpaRepository<Wife, Long> {
	Wife findByName(String name);
}
