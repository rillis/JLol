package com.jlol.exception;

public class ChampionNotFound extends Exception{
	private static final long serialVersionUID = -6924030617380368338L;

	public ChampionNotFound(String errorMessage) {
        super(errorMessage);
    }
}
