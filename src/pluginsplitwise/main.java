package pluginsplitwise;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		FuelCalculator fc = new FuelCalculator();		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter distances : ");
		fc.setD(sc.nextDouble());
		System.out.print("Enter number of vehicle(s) : ");
		fc.setVq(sc.nextInt());
		fc.consumeVehicles();
		System.out.print("Enter gas's price : ");
		fc.setGp(sc.nextDouble());
		System.out.print("Number of people : ");
		fc.setP(sc.nextInt());
		fc.calConsump();
		System.out.println(fc.result());
		sc.nextLine();		
		System.out.println("\nPress Enter to exit");
		sc.nextLine();
		System.out.println("Bye");
		sc.close();
	}
}
