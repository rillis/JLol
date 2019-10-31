package com.jlol.exception;

public class InvalidToken extends Exception{
	private static final long serialVersionUID = 3049732745953109955L;

	public InvalidToken(String errorMessage) {
        super(errorMessage);
    }
}
