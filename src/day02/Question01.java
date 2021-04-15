package day02;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		/*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede ‘e’ harfi 3 kere kullanilmis.
         */
		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen bir cumle girin");
		String cumle=scan.next();
		System.out.println("Lutfen bir harf girin");
		char harf=scan.next().charAt(0);
		
		int sayi=0;
		
		for(int i=0; i<=cumle.length()-1;i++){
		char kontrol=cumle.charAt(i);
		if (harf==kontrol) {
			sayi++;
		}
		}
		System.out.println("Girdiginiz cumlede '"+harf+"' harfi "+sayi+" kere var");
		
	scan.close();}

}
