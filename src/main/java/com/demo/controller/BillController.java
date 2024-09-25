package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Bill;
import com.demo.service.BillService;

@RestController
public class BillController {
	@Autowired
	private BillService billService;

	@PostMapping("/saveOperation")
	public Bill saveOperation(@RequestBody Bill bill) {
		Bill bil = billService.saveOperation(bill);
		return bil;
	}

	@PutMapping("/updateOperation")
	public Bill updateOperation(@RequestBody Bill bill) {
		Bill bil2 = billService.updateOperation(bill);
		return bil2;
	}

	@GetMapping("/getOperation")
	public List<Bill> getOperation(Bill bill) {
		List<Bill> bil3 = billService.getOperation(bill);
		return bil3;
	}

	@GetMapping("/findById/{id}")
	public Bill findById(@PathVariable("id") Integer id) {
		Bill bil4 = billService.findById(id);
		return bil4;
	}

	@DeleteMapping("/deleteById/{id}")
	public String deleteById(@PathVariable("id") Integer id) {
		String str = billService.deleteById(id);
		return str;
	}

}
