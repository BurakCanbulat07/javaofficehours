package day01;

import java.util.Scanner;

public class Question02 {
public static void main(String[] args) {
	/** Soru 2: Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
	 * ekrana yazdiran java kodunu yaziniz.
	 * INPUT : Y
	 * 	OUTPUT : YES
	 */
	Scanner scan=new Scanner(System.in);
	System.out.println("Lutfen Y/N ikilisinden birini giriniz");
	char harf=scan.next().toUpperCase().charAt(0);
	
	switch (harf) {
	case 'Y':
		System.out.println("Yes");
		break;
	case 'N':
		System.out.println("No");
		break;
	default:
		System.out.println("Y veya N girdiginize emin olun");
		scan.close();
	}
}
}
