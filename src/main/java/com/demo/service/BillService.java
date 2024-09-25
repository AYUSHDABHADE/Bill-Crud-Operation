package com.demo.service;

import java.util.List;

import com.demo.model.Bill;

public interface BillService {

	public Bill saveOperation(Bill bill);
	
	public Bill updateOperation(Bill bill);
	
	public List<Bill> getOperation(Bill bill);
	
	public Bill findById(Integer id);
	
	public String deleteById(Integer id);
}
