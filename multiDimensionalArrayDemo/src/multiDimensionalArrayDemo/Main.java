package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] sehirler = new String[3][3];
		sehirler[0][0] = "Denizli";
		sehirler[0][1] = "Izmir";
		sehirler[0][2] = "Afyon";
		sehirler[1][0] = "Istanbul";
		sehirler[1][1] = "Bilecik";
		sehirler[1][2] = "Bursa";
		sehirler[2][0] = "Malatya";
		sehirler[2][1] = "SanliUrfa";
		sehirler[2][2] = "GaziAntep";
		for(int i =0;i<=2;i++) {
			System.out.println("-----------------------");
			for(int j = 0;j <= 2;j++) {
				System.out.println(sehirler[i][j]);
			}
		}
	}

}