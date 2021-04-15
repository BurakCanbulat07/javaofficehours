package day04;

public class Question02 {
	
	public static void main(String[] args) {
		
		double arr[] = {1,2,3,4,5,6,7};
		
		System.out.println(ortalamaBul(arr));
	}

	public static double ortalamaBul(double[] arr) {

		double ortalama=0;
		  double toplam=0;
			for (double i : arr) {
				toplam+=i;
			}
			
			ortalama=toplam/arr.length;
		return ortalama;
	}


}
