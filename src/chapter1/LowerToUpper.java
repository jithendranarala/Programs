package chapter1;

public class LowerToUpper {

	public static void main(String[] args) {
		String str = "jithendra";
		char str1[] = str.toCharArray();
 		for (int i = 0; i < str1.length; i++) {
			if (str1[i] >= 'a' && str1[i] <= 'z'){
				str1[i]= (char)((int)str1[i] -32);
			}
		}
 		System.out.println("Upper case");
 		for (int i = 0; i < str1.length; i++) {
 			System.out.print(str1[i]);
			
		}
	}

}
