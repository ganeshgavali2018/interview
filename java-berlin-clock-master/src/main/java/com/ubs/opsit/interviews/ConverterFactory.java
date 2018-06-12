package com.ubs.opsit.interviews;

public class ConverterFactory {

	public static Converter getInstance(Type type) {
		if (type.equals(Type.HOURS)) {
			return new HoursConverter();
		} else if (type.equals(Type.MINUTES)) {
			return new MinutesConverter();
		} else if (type.equals(Type.SECONDS)) {
			return new SecondsConverter();
		}

		return null;
	}

	enum Type {
		HOURS, MINUTES, SECONDS;
	}

}
