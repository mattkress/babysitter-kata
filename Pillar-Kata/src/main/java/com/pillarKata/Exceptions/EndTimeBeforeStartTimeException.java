package com.pillarKata.Exceptions;

public class EndTimeBeforeStartTimeException extends Exception{
	public EndTimeBeforeStartTimeException(String errorMessage) {
        super(errorMessage);
    }
}
