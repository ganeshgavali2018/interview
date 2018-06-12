package com.ubs.opsit.interviews;

public class MinutesConverter extends Converter {
	private final static int FIRST_ROW_LAMPS = 11;
	private final static int SECOND_ROW_LAMPS = 4;

	@Override
	public String convert(int minutes) {

		StringBuilder minuteLamps = new StringBuilder();

		int firstRowVal = minutes / 5;
		int secondRowVal = minutes % 5;

		for (int i = 0; i < FIRST_ROW_LAMPS; i++) {
			if (i < firstRowVal) {
				if ((i + 1) % 3 == 0) { // 3rd, 6th and 9th Lamps are red indicate the first quarter, half and last quarter of an hour
					minuteLamps.append(Lamp.RED.dipslay());
				} else {
					minuteLamps.append(Lamp.YELLOW.dipslay());
				}
			} else {
				minuteLamps.append(Lamp.NONE.dipslay());
			}
		}

		minuteLamps.append("\r\n");

		for (int i = 0; i < SECOND_ROW_LAMPS; i++) {
			if (i < secondRowVal) {
				minuteLamps.append(Lamp.YELLOW.dipslay());
			} else {
				minuteLamps.append(Lamp.NONE.dipslay());
			}
		}

		return minuteLamps.toString();
	}

}
