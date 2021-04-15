package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question02 {
	/*
 	Kullanicidan alinan degerleri ArrayList'e ceviren Java programini
 	yaziniz. Kullanici deger girmek istemedigi zaman donguyu kirin
 */
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		int count=0;
		do {
			System.out.println("Deger girmek istiyorsaniz 'E' ye istemiyorsaniz 'H' ye basin");
			char secim=scan.next().toUpperCase().charAt(0);
			if (secim=='E') {
				System.out.println("Lutfen bir string girin");
				list.add(scan.next());
			}else if (secim=='H') {
				break;
			}else {
				count++;
				if (count<3) {
					System.out.println("Yanlis girdiniz tekrar deneyin");
				}
				if (count==3) {
					System.out.println("3 kere yanlis girdiniz bloke oldu");
					break;
				}
			}
		} while (true);
		
		System.out.println(list);
	scan.close();}	
}
