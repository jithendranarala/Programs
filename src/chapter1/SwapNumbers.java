package chapter1;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		int x,y,temp;
		Scanner sc = new Scanner(System.in);
		x= sc.nextInt();
		y= sc.nextInt();
		System.out.println("Before Swapping " + " X value : " + x + " and Y value : " + y);
		temp =x;
		x=y;
		y=temp;
		System.out.println("After Swapping " + " X value : " + x + " and Y value : " + y);

	}

}
