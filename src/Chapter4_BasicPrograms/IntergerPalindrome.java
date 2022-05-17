package Chapter4_BasicPrograms;

public class IntergerPalindrome {

	public static void main(String[] args) {
		int num = 949;
		int palindrome = num;
		int remainder;
		int reverse=0;
		
		while (palindrome !=0) {
			remainder = palindrome%10;
			reverse = (reverse * 10) + remainder;
			palindrome = palindrome/10;
		}
		System.out.println(num);
		System.out.println(reverse);
		
	}

}
