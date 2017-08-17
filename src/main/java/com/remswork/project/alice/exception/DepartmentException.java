package com.remswork.project.alice.exception;

public class DepartmentException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DepartmentException() {
		super();
	}
	
	public DepartmentException(final String message) {
		super(message);
	}
}
