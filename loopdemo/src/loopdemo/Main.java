package loopdemo;

public class Main {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 20; i += 3) {
			System.out.println(i);
		}
		System.out.println("For dongusu bitti.");

		int k = 1;
		while (k < 14) {
			System.out.println(k);
			k++;
		}

		System.out.println("while dongusu bitti.");

		int j = 1453;
		do {
			System.out.println(j);
			j += 20;
		} while (j < 20);
		System.out.println("Do-while dongusu bitti.");
	}

}
