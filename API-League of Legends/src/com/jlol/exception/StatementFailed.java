package com.jlol.exception;

public class StatementFailed extends Exception{
	private static final long serialVersionUID = -6924030617380368338L;

	public StatementFailed(String errorMessage) {
        super(errorMessage);
    }
}
