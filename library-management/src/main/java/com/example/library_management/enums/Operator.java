package com.example.library_management.enums;

public enum Operator {
	EQUAL("="), LESS_THEN("<"), GREATER_THEN(">"), LESS_THEN_EQUAL("<="), GREATER_THEN_EQUAL(">="), IN("in"),
	LIKE("LIKE");

	private String value;

	private Operator(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}
}
