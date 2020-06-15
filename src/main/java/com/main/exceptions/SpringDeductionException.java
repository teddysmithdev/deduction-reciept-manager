package com.main.exceptions;

public class SpringDeductionException extends RuntimeException {
	public SpringDeductionException(String exMessage, Exception exception) {
        super(exMessage, exception);
    }

    public SpringDeductionException(String exMessage) {
        super(exMessage);
    }
}
