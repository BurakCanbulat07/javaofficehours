package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		/*
	     * Kullanicidan bir isim alin ve bu ismi char array'ine donusturen bir method yazin
	     * 
	     *
	     * (toCharArray methodunu kullanmayin)
	     *
	     * Input : John
	     * Output : [J, o, h, n]
	     */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir kelime girin");
		String str=scan.next();
		
		charArray(str);
	scan.close();}

	@SuppressWarnings("unchecked")
	public static void charArray(String str) {
		
		@SuppressWarnings("rawtypes")
		List list=new ArrayList<>();
		
		char harf;
		for(int i=0;i<str.length();i++) {
			harf=str.charAt(i);
			list.add(harf);
		}
		
			
		Object[] arr= list.toArray();
		
		System.out.println(Arrays.toString(arr));
	}
}
