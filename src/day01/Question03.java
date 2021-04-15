package day01;

import java.util.Scanner;

public class Question03 {
public static void main(String[] args) {
	/*
     * Kullanicidan uc basamakli bir sayi alin
     * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
     *
     *
     * Ornek : Inputs : 853
     * Output : Girdiginiz sayinin birler basamagi : 3
     *          Girdiginiz sayinin onlar basamagi : 5
     *          Girdiginiz sayinin yuzler basamagi : 8
     *
     *
     */
	Scanner scan=new Scanner(System.in);
	System.out.println("Lutfen 3 basamakli tam sayi giriniz");
	int sayi= scan.nextInt();//234
	
	int birlerBas = sayi%10;//234 - 4
	int sayi2= sayi/=10;//234 - 23
	int onlarBas = sayi2%10; //23- 3
	int sayi3= sayi2/=10;//23 -2
	int yuzlerBas = sayi3;//2
	
	if (sayi>99&&sayi<1000) {
		System.out.println("Birler basamagi: "+birlerBas);
		System.out.println("Onlar basamagi: "+onlarBas);
		System.out.println("Yuzler basamagi: "+yuzlerBas);
	} else {
	System.out.println("Sayi 3 basamakli degil");
	}
	scan.close();
}
}
