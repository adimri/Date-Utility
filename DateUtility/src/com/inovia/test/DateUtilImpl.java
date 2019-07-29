package com.inovia.test;

public class DateUtilImpl implements IDateUtil {

	@Override
	public int diff(Date firstDate, Date secondDate) {
		int daysFirstDate = Integer.parseInt(firstDate.getyYYYY()) * 365 + Integer.parseInt(firstDate.getdD());

		for (int i = 0; i < Integer.parseInt(firstDate.getmM()) - 1; i++) {
			daysFirstDate += DateFormatter.daysInMonth[i];
		}

		daysFirstDate += DateFormatter.countLeapYear(firstDate);

		int daysSecondDate = Integer.parseInt(secondDate.getyYYYY()) * 365 + Integer.parseInt(secondDate.getdD());
		for (int i = 0; i < Integer.parseInt(secondDate.getmM()) - 1; i++) {
			daysSecondDate += DateFormatter.daysInMonth[i];
		}
		daysSecondDate += DateFormatter.countLeapYear(secondDate);
		return (daysSecondDate - daysFirstDate);
	}

}