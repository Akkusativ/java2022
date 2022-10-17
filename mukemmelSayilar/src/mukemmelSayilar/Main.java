package mukemmelSayilar;

public class Main {

	public static void main(String[] args) {
		int sayi =5;
		int total =0;
		for(int i =1;i<sayi;i++) {
			if(sayi%i==0) {
				total +=i;
			}
		}
		if (total==sayi) {
			System.out.println(sayi+" sayisi mukemmel sayidir.");
		}else {
			System.out.println(sayi+" sayisi mukemmel sayi degildir.");
		}
	}

}
