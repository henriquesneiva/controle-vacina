package com.henrique.controlevacina.resource.exception;

import javax.servlet.ServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.henrique.controlevacina.servise.exception.ObjectNotFoundException;

@ControllerAdvice
public class ResouceExceptionHandler  {

	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandedError> objectNotFoundException(ObjectNotFoundException e, ServletRequest request){
		StandedError error = new StandedError(System.currentTimeMillis(), HttpStatus.NOT_FOUND.value(), e.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}
	
}
