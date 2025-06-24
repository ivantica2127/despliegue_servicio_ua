package com.ua.sales.domain.exceptions;

public class EMailInvalidException extends RuntimeException {

	public EMailInvalidException() {
		super("Email Invalid");
	}
}
