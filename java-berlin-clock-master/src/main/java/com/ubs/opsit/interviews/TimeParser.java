package com.ubs.opsit.interviews;

import java.util.regex.Pattern;

public class TimeParser {

	private static int MIN_VAL = 0;
	private static int HOURS_MAX_VAL = 24;
	private static int MINUTES_MAX_VAL = 59;
	private static int SECONDS_MAX_VAL = 59;

	public static Time parse(String aTime) throws InvalidTimeException {
		if (aTime == null) {
			throw new InvalidTimeException("Invalid Time");
		}

		Pattern p = Pattern.compile("\\d{2}:\\d{2}:\\d{2}");
		if (!p.matcher(aTime).matches()) {
			throw new InvalidTimeException("Invalid Time");
		}

		final String[] timeStrArray = aTime.split(":");

		int hours = Integer.parseInt(timeStrArray[0]);
		int minutes = Integer.parseInt(timeStrArray[1]);
		int seconds = Integer.parseInt(timeStrArray[2]);

		validate(hours, MIN_VAL, HOURS_MAX_VAL);
		validate(minutes, MIN_VAL, MINUTES_MAX_VAL);
		validate(seconds, MIN_VAL, SECONDS_MAX_VAL);

		Time t = new Time(hours, minutes, seconds);
		return t;
	}

	private static void validate(int val, int minVal, int maxVal) throws InvalidTimeException {
		if (val < minVal || val > maxVal) {
			throw new InvalidTimeException("Invalid Time");
		}
	}
}
