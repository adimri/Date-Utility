package com.inovia.test;

public class DateFormatter {

	public static int daysInMonth[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	// format date to store it in Date object
	public static Date formatDate(String date) {
		String[] ddmmYYYY = date.split("/");
		if (ddmmYYYY.length != 3) {
			throw new IllegalArgumentException("Please enter a valid date");
		}
		int dd = Integer.parseInt(ddmmYYYY[0]);
		int mm = Integer.parseInt(ddmmYYYY[1]);
		int yyyy = Integer.parseInt(ddmmYYYY[2]);
		if (!isValidDate(dd, mm, yyyy)) {
			throw new IllegalArgumentException("Please enter a valid date");
		}
		return new Date(ddmmYYYY[0], ddmmYYYY[1], ddmmYYYY[2]);
	}

	// check if the date is a valid date or not
	public static boolean isValidDate(int day, int month, int year) {
		if (year < 0)
			return false;
		if ((month < 1) || (month > 12))
			return false;
		if ((day < 1) || (day > 31))
			return false;
		switch (month) {
		case 1:
			return true;
		case 2:
			return (isLeapYear(year) ? day <= 29 : day <= 28);
		case 3:
			return true;
		case 4:
			return day < 31;
		case 5:
			return true;
		case 6:
			return day < 31;
		case 7:
			return true;
		case 8:
			return true;
		case 9:
			return day < 31;
		case 10:
			return true;
		case 11:
			return day < 31;
		default:
			return true;
		}
	}

	// check if the date is a leap year or not
	public static boolean isLeapYear(int year) {
		if (year % 4 != 0) {
			return false;
		} else if (year % 400 == 0) {
			return true;
		} else if (year % 100 == 0) {
			return false;
		} else {
			return true;
		}
	}

	// count number of leap years before the given date
	public static int countLeapYear(Date date) {
		int year = Integer.parseInt(date.getyYYYY());

		if (Integer.parseInt(date.getmM()) <= 2) {
			year--;
		}

		return year / 4 - year / 100 + year / 400;
	}

}
