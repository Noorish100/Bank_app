package com.bank.exceptions;

import java.time.LocalDateTime;

public class MyErrorMessage {

	private LocalDateTime localdatetime;
	private String message;
	private String detailstring;
	
	
	public MyErrorMessage() {
		// TODO Auto-generated constructor stub
	}


	public MyErrorMessage(LocalDateTime localdatetime, String message, String detailstring) {
		super();
		this.localdatetime = localdatetime;
		this.message = message;
		this.detailstring = detailstring;
	}
	
}
