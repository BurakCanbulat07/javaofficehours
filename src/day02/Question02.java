package day02;

public class Question02 {
public static void main(String[] args) {
	String uceBolunen="",beseBolunen="",onBeseBolunen="";
    
    for (int i = 1; i < 101; i++) {
        if (i%3==0)uceBolunen+=i+" ";
        if (i%5==0)beseBolunen+=i+" ";
        if (i%15==0)onBeseBolunen+=i+" ";
    }
    System.out.println("Uce Bölünen Sayiler :" +uceBolunen);
    System.out.println("Bese Bölünen Sayiler :" +beseBolunen);
    System.out.println("Onbese Bölünen Sayiler :" +onBeseBolunen);
}
}
