package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bank.models.Transection;
import com.bank.models.User;
import com.bank.service.Bank_service;
@RestController
public class userController {
	
	@Autowired
	private  Bank_service b;
   
	
	
	@PostMapping("/user")
	public ResponseEntity<User> saveCustomerDetailsHandler(@RequestBody User user)
	{
       User savedUser= b.create_user(user);
		return new ResponseEntity<User>(savedUser,HttpStatus.CREATED);
	}
	
	@GetMapping("/credit")
	public String CreditAmount(@RequestParam("accno") int accno, @RequestParam("bal") int bal ){
		
		
		
		return b.credit(accno, bal);
		
	}
	
	@GetMapping("/debit")
	public String debitAmount(@RequestParam("accno") int accno,@RequestParam("bal") int bal  ){
		
		
		
		return b.debit(accno, bal);
		
	}
}
