package com.bank.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalException {
	
	
	@ExceptionHandler(UserException.class)
	public ResponseEntity<MyErrorMessage> customerExpHandler(UserException ie,WebRequest wr)  {
		System.out.println("Inside customer exception handler");
		
		MyErrorMessage err = new MyErrorMessage(LocalDateTime.now(), ie.getMessage(), wr.getDescription(false));
		
		
	
	 return new ResponseEntity<MyErrorMessage>(err, HttpStatus.BAD_REQUEST);		
		
	}
	

}
