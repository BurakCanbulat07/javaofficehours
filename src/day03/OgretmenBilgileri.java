package day03;

import java.util.Scanner;

public class OgretmenBilgileri {
	/* Soru Class’i olusturun bu Class’da bir Ogretmen icin gerekli
     * bilgileri girebilecegim Instance Variable’lar olusturun
     * ve main method icinde bu variable’lara deger atayin ve yazdirin
     */
	static String isim;
	static int yas;
	static String brans;
	static int maas;
	 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen isiminizi giriniz");
		String isim2 = scan.next();
		
		System.out.println("Lutfen yasinizi giriniz");
		int yas2 = scan.nextInt();
		
		System.out.println("Lutfen bransinizi giriniz");
		String brans2 = scan.next();
		
		System.out.println("Lutfen maasinizi giriniz");
		int maas2 = scan.nextInt();
		
		isim=isim2;
		yas=yas2;
		brans=brans2;
		maas=maas2;
		
		System.out.println("Isminiz: "+isim);
		System.out.println("Yasiniz: "+yas);
		System.out.println("Bransiniz: "+brans);
		System.out.println("Maasiniz: "+maas);
		
	scan.close();}
    
}