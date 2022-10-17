package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,5,9,0};
		int find = 9;
		for(int ara : sayilar) {
			if(find==ara) {
				System.out.println("Sayi bulundu.");
				return;
			}
			
		}
		System.out.println("Sayi bulunamadi.");
	}

}
