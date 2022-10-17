package reCapDemo2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] myList = {1.2,8.4,6.3,9.1,1.9};
		double total = 0;
		double max = myList[0];
		for (double i : myList) {
			if(max < i) {
				max = i;
			}
			total += i; 
			System.out.println(i);
		}
		System.out.println("Toplam ="+total);
		System.out.println("Max = "+max);
	}

}
