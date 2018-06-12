package com.ubs.opsit.interviews;

public enum Lamp {

	RED("R"), YELLOW("Y"), NONE("O");

	String val;

	Lamp(final String val) {
		this.val = val;
	}

	String dipslay() {
		return val;
	}

}
