package chapter1;

import java.util.Scanner;

public class Page1_StrRev {

	public static void main(String[] args) {
		Page1_StrRev pg1 = new Page1_StrRev();
		pg1.strRev1();
		pg1.strRev2();
		pg1.strRev3();
	}

	void strRev1() {
		String str = "Jithendra";
		StringBuilder str1 = new StringBuilder();
		str1.append(str);
		System.out.println(str1.reverse());
	}

	void strRev2() {
		String str = "Jithendra";
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}

	void strRev3() {
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2[] = str1.split("");
		System.out.println(str2.length);
		for (int i = str2.length ; i > 0; i--) {
			System.out.print(str2[i - 1]);
		}

	}
}
