package chapter1;

public class Page1_StrRev {

	public static void main(String[] args) {
		Page1_StrRev pg1 = new Page1_StrRev();
		pg1.strRev1();
		pg1.strRev2();
		}
	
	void strRev1() {
		String str = "Jithendra";
		StringBuilder str1 = new StringBuilder();
		str1.append(str);
		System.out.println(str1.reverse());
	}
	
	void strRev2() {
		String str = "Jithendra";
		for (int i = str.length()-1 ; i >= 0 ; i--) {
		 System.out.print(str.charAt(i));	
		}
		
	}

}
