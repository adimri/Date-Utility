package com.inovia.test;

import java.util.Scanner;

public class DateTest {
	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {

			System.out.print("Please enter the first Date in dd/mm/YYYY format: ");
			String date1 = scanner.nextLine();
			System.out.print("Please enter the second Date in dd/mm/YYYY format: ");
			String date2 = scanner.nextLine();
			DateUtilImpl dateUtilImpl = new DateUtilImpl();
			System.out.print("The differnce between two dates is  = "
					+ dateUtilImpl.diff(DateFormatter.formatDate(date1), DateFormatter.formatDate(date2)));

		}
	}

}
