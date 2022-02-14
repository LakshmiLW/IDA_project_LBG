package com.lloyds.ida.atmlocatorservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class IdentificationNotFoundException extends RuntimeException {
	public IdentificationNotFoundException(String message) {
		super(message);
	}
}