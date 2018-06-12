package com.ubs.opsit.interviews;

public class SecondsConverter extends Converter {

	@Override
	public String convert(int seconds) {
		if (seconds % 2 == 0) {
			return Lamp.YELLOW.dipslay();
		} else {
			return Lamp.NONE.dipslay();
		}
	}

}
