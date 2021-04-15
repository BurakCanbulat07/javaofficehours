package day06;

import java.util.Scanner;

public class Question02 {
	/*
 	Kullanicidan yasini alin ve eger kullanici yasini 0 veya daha az bir yas girerse
 kullaniciya musade etmeyin(Exception throw edin)
 */
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Lutfen yasinizi girin");
	int yas =scan.nextInt();
	scan.close();
	
	if (yas<1) {
		throw new IllegalArgumentException("Yas cok kucuk");
	}
	}

}