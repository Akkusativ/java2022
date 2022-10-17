package arkadasSayilar;

public class Main {
	public static int bolenSayisi(int s) {
		int total = 0;
		for (int i = 1; i < s; i++) {
			if(s%i==0) {
				total+=i;
			}
		}
		return total;
	}

	public static void main(String[] args) {
		int sayi1 = 17296, sayi2 = 18416;
		
		if(bolenSayisi(sayi1)==sayi2 || bolenSayisi(sayi2)==sayi1) {
			System.out.println(sayi1+" ve "+sayi2+" arkadas sayilardir.");
		}else {
			System.out.println(sayi1+" ve "+sayi2+" arkadas sayi degildir.");
		}
		
	}

}
