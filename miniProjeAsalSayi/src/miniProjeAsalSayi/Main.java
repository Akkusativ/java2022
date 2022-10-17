package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int sayi = 20;
		int temp = 0;
		int[] bolen = new int[40];//Bolenleri bulmak icin dizi olusturduk. 
		bolen[0] = 1;//ilk bolen her zaman 1.
		if (sayi <= 1) {
			System.out.println("Lutfen 1'den buyuk bir tam sayi giriniz.");
			return;
		}
		if (sayi != 2) {
			for (int i = 2; i < sayi; i++) {
				if (sayi % i == 0) {// Tum bolenleri diziye ekleme.
					bolen[temp + 1] = i;
					temp++;
				}

			}
			if (temp >= 1) {//temp 1'den buyukse sayi asal degildir.
				System.out.println("Sayi Asal Degildir.");
				System.out.println("Bolen sayisi=" + (temp + 2));
				bolen[temp + 1] = sayi;//dizinin son elemani sayinin kendisi(her zaman)
				System.out.println("Bolenler=");
				for (int i : bolen) {
					System.out.println(i);
				}

			} else if (temp == 0) {
				System.out.println("Sayi Asal Sayidir.Carpanlari=1 ve " + sayi);
			}
		} else if (sayi == 2) {
			System.out.println("Sayi asal sayilarin en kucugu 2'dir.");
		}

	}

}
