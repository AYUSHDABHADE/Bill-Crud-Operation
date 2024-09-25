package com.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bill_table")
public class Bill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private int custamerId;
	private String date;
	private String totalAmount;
	private String status;
	private String paymentMethod;

	public int getBillId() {
		return id;
	}

	public void setBillId(int billId) {
		this.id = billId;
	}

	public int getCustamerId() {
		return custamerId;
	}

	public void setCustamerId(int custamerId) {
		this.custamerId = custamerId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	@Override
	public String toString() {
		return "Bill [billId=" + id + ", custamerId=" + custamerId + ", date=" + date + ", totalAmount="
				+ totalAmount + ", status=" + status + ", paymentMethod=" + paymentMethod + "]";
	}

}
