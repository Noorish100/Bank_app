package com.bank.models;

import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.datetime.standard.DateTimeContext;

@Entity
public class Transection {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int transectionId;
	private LocalDateTime date;
	private String type ;
	private int accno;
	private int balance;
	private int remBal;
	
	public Transection() {
		// TODO Auto-generated constructor stub
	}

	public Transection(LocalDateTime date, String type, int accno, int balance, int remBal) {
		super();
		this.date = date;
		this.type = type;
		this.accno = accno;
		this.balance = balance;
		this.remBal = remBal;
	}
	
	public Transection(String type, int accno, int balance, int remBal) {
		super();
		this.date = LocalDateTime.now();  
		this.type = type;
		this.accno = accno;
		this.balance = balance;
		this.remBal = remBal;
	}


	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getRemBal() {
		return remBal;
	}

	public void setRemBal(int remBal) {
		this.remBal = remBal;
	}

	@Override
	public String toString() {
		return "Transection [date=" + date + ", type=" + type + ", accno=" + accno + ", balance=" + balance
				+ ", remBal=" + remBal + "]";
	}
	
	
}
