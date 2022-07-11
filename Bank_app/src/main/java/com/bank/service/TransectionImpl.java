package com.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.models.Transection;
import com.bank.repository.TransectionDao;


@Service
public class TransectionImpl implements TransectionService{

	
	@Autowired
	private TransectionDao tdao;
	
	
	@Override
	public List<Transection> getstatement(int accno) {
		
		List<Transection> t1 =tdao.findByAccno(accno);
		// TODO Auto-generated method stub
		return t1;
	}

}
