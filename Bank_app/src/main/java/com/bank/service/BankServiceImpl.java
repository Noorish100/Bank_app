package com.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.models.Transection;
import com.bank.models.User;
import com.bank.repository.TransectionDao;
import com.bank.repository.UserDao;

@Service
public class BankServiceImpl implements Bank_service {

	@Autowired
	private UserDao userdao;
	
	@Autowired
	private TransectionDao tdao;
	
	@Override
	public User create_user(User user) {
		if(user!=null) {
			   User u1= userdao.save(user);
			   tdao.save(new Transection("opening account", u1.getAccno(), u1.getBalance(), u1.getBalance()));
			return u1;
		}
		return null;
	}

	@Override
	public String credit(int accno , int v) {
		
	   User u1=userdao.findByAccno(accno);
	 
		// TODO Auto-generated method stub
	   if(u1!=null) {
		   System.out.println("hiii");
		   u1.setBalance(u1.getBalance()+v);
		   tdao.save(new Transection("credit amount", u1.getAccno(), v, u1.getBalance()));
		   
		   userdao.save(u1);

		   return "your balance credited";
	   }
	   return "account dosen't exist";
	}

	@Override
	public String debit(int accno ,int v) {
		
		   User u1=userdao.findByAccno(accno);

		  if(u1!=null) {
			  
			  if(u1.getBalance()>=v) {
			 
				  u1.setBalance(u1.getBalance()-v);
				  
				  tdao.save(new Transection("debit amount", u1.getAccno(), v, u1.getBalance()));
				   
				   userdao.save(u1);
				  return "your amount  is debited ";
				  
			  }
		  else {
			  return "Insufficient balance";
		   }
		  }
		   return "account dosen't exist";
	}

}
	
