package com.bank.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int user_id;
	private String mobileno;
	private String name;
	private String address;
	private String bank_name;
	private String type;
	private int balance;
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int accno;
	
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}



	public User(int user_id, String mobileno, String name, String address, String bank_name, String type, int balance,
			int accno) {
		super();
		this.user_id = user_id;
		this.mobileno = mobileno;
		this.name = name;
		this.address = address;
		this.bank_name = bank_name;
		this.type = type;
		this.balance = balance;
		this.accno = accno;
	}



	public int getUser_id() {
		return user_id;
	}



	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}



	public String getMobileno() {
		return mobileno;
	}



	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getBank_name() {
		return bank_name;
	}



	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public int getBalance() {
		return balance;
	}



	public void setBalance(int balance) {
		this.balance = balance;
	}



	public int getAccno() {
		return accno;
	}



	public void setAccno(int accno) {
		this.accno = accno;
	}



	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", mobileno=" + mobileno + ", name=" + name + ", address=" + address
				+ ", bank_name=" + bank_name + ", type=" + type + ", balance=" + balance + ", accno=" + accno + "]";
	}
   
	
	
	

}
