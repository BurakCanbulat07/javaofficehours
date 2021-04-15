package day01;

import java.util.Scanner;
/*
Kullanicidan kilosunu ve boyunu alip
Vucut kitle indeksini hesaplayan bir program yaziniz.
Ipucu : Vucut 
Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
ORNEK:
INPUT      : Kilo: 71
             Boy: 1,72
OUTPUT  : Vucut Kitle Indeksiniz : 23
*/

public class Question06 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bouyunuzu cm olarak girin");
		double boy=scan.nextDouble();
		System.out.println("kilonuzu kg olarak girin");
		double kilo=scan.nextDouble();
		
		double boyM= boy/100;
		
		double sonucDb= kilo/(boyM*boyM);
		int sonucInt= (int) (kilo/(boyM*boyM));
		
		System.out.println("Vucut kitle endeksiniz: "+ sonucInt);
		System.out.println("Vucut kitle endeksiniz: "+ sonucDb);
		
		scan.close();
	}

}
