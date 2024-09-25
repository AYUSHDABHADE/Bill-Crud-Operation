package com.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Bill;
import com.demo.repository.BillRepository;
import com.demo.repository.FindByidRepo;
import com.demo.service.BillService;

@Service
public class BillImpl implements BillService {
	@Autowired
	private BillRepository billRepository;
	@Autowired
	private FindByidRepo findByidRepo;

	@Override
	public Bill saveOperation(Bill bill) {
		Bill bill1 = billRepository.save(bill);
		return bill1;
	}

	@Override
	public Bill updateOperation(Bill bill) {
		Bill bill2 = billRepository.save(bill);
		return bill2;
	}

	@Override
	public List<Bill> getOperation(Bill bill) {
		List<Bill> bill3 = billRepository.findAll();
		return bill3;
	}

	@Override
	public Bill findById(Integer id) {
		Bill bill4 = findByidRepo.findById(id);
		return bill4;
	}

	@Override
	public String deleteById(Integer id) {
		billRepository.deleteById(id);
		return "Delete Operation Is Done";
	}

}
