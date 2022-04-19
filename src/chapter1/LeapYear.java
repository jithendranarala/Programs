package chapter1;

import java.util.Calendar;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println(isLeapYear(1979));

	}

	public static boolean isLeapYear(int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		int noOfDays = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
		if (noOfDays > 365) {
			return  true;
		} 
			return false;
	}
}
