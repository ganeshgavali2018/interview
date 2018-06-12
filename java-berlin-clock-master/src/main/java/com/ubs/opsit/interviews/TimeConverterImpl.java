package com.ubs.opsit.interviews;

public class TimeConverterImpl implements TimeConverter {

	@Override
	public String convertTime(String aTime) {

		try
		{
			Time t = TimeParser.parse(aTime);
			StringBuilder convertedTime = new StringBuilder();

			convertedTime.append(ConverterFactory.getInstance(ConverterFactory.Type.SECONDS).convert(t.getSecs()) + "\r\n");
			convertedTime.append(ConverterFactory.getInstance(ConverterFactory.Type.HOURS).convert(t.getHours()) + "\r\n");
			convertedTime.append(ConverterFactory.getInstance(ConverterFactory.Type.MINUTES).convert(t.getMinutes()));
			return convertedTime.toString();
		}
		catch(Exception e)
		{
			return e.getMessage();
		}
	}

}
