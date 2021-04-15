package day01;

import java.util.Scanner;
/*
Kullanicidan bir karakter girmesini isteyip, o karakterin ascii degerini yazdirin
ORNEK:
   INPUT : #
	 OUTPUT : girdiginiz # karakterinin ascii degeri = 125'dir.
*/

public class Question01 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Lutfen bir karakter giriniz");
	char karakter=scan.next().charAt(0);
	System.out.println("Girdiginiz '"+karakter+"' karakterinin ASCII degeri: "+(0+karakter));
	scan.close();
}
}
