package com.jeb.helpdesk.services.exceptions;

public class DataIntegrifyViolationException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public DataIntegrifyViolationException(String message, Throwable cause) {
		super(message, cause);
	}

	public DataIntegrifyViolationException(String message) {
		super(message);
	}


}
