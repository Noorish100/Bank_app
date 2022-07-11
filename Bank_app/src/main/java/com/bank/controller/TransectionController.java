package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bank.models.Transection;
import com.bank.service.TransectionService;

@RestController
public class TransectionController {
	
	@Autowired
	private TransectionService tserv;
	
	@GetMapping("/details")
	public List<Transection> gettransection(@RequestParam("accno") int accno  ){
		
		
		
		return tserv.getstatement(accno);
		
	}
	
	
	

}
