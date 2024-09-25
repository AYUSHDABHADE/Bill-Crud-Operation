package com.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Bill;
@Repository
public interface FindByidRepo extends JpaRepository<Bill, Serializable>{
	public Bill findById(Integer id);
}
