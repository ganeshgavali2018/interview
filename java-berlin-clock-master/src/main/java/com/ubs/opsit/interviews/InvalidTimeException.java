package com.ubs.opsit.interviews;

public class InvalidTimeException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidTimeException(String s) {
		// Call constructor of parent Exception
		super(s);
	}

}
