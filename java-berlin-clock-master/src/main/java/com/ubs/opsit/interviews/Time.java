package com.ubs.opsit.interviews;

public final class Time {
	private int hours;
	private int minutes;
	private int secs;

	public Time(int hours, int minutes, int secs) {
		this.hours = hours;
		this.minutes = minutes;
		this.secs = secs;
	}

	public int getHours() {
		return hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public int getSecs() {
		return secs;
	}

	@Override
	public String toString() {
		return "Time [hours=" + hours + ", minutes=" + minutes + ", secs=" + secs + "]";
	}
}
