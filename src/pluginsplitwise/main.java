package pluginsplitwise;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		FuelCalculator fc = new FuelCalculator();		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of vehicle(s) : ");
		fc.setVehicleQuantity(sc.nextInt());
		fc.vehicleDistances();
		fc.consumeVehicles();
		System.out.print("Enter gas's price : ");
		fc.setGp(sc.nextDouble());
		System.out.print("Number of people : ");
		fc.setP(sc.nextInt());
		fc.printEachVehicleDistance();
		fc.printAvgConsumption();
		fc.calConsump();
		fc.printTotalGasConsume();
		fc.printEachVehicleConsume();
		fc.printTotalPrice();
		System.out.println(fc.printPricePerPerson());
		sc.nextLine();		
		System.out.println("\nPress Enter to exit");
		sc.nextLine();
		System.out.println("Bye");
		sc.close();
	}
}
