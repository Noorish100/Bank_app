package com.bank.service;

import com.bank.models.User;

public interface Bank_service {
	
	public User create_user (User user);
	public String credit (int v,int s);
	public String debit (int v,int s);

	
}
