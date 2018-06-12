package com.ubs.opsit.interviews;

public class HoursConverter extends Converter {

	private static int TOTAL_LAMPS = 4;
	
	@Override
	public String convert(int hours) {
		StringBuilder hourLamps = new StringBuilder();

		int firstRowVal = hours / 5;
		int secondRowVal = hours % 5;

		for (int i = 0; i < TOTAL_LAMPS; i++) {
			if (i < firstRowVal) {
				hourLamps.append(Lamp.RED.dipslay());
			} else {
				hourLamps.append(Lamp.NONE.dipslay());
			}
		}

		hourLamps.append("\r\n");

		for (int i = 0; i < TOTAL_LAMPS; i++) {
			if (i < secondRowVal) {
				hourLamps.append(Lamp.RED.dipslay());
			} else {
				hourLamps.append(Lamp.NONE.dipslay());
			}
		}

		return hourLamps.toString();

	}

}
