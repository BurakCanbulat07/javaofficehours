package day06;

import java.util.Scanner;

public class Question01 {
	
	// Q #1) replace() methodu kullanmadan bir string deki bosluklari kaldiran java kodunu yaziniz
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir string girin");
		String str = scan.nextLine().trim();
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)!=' ') {
				System.out.print(str.charAt(i));
			}
		}
	scan.close();}

}
