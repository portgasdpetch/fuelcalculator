package pluginsplitwise;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		FuelCalculator fc = new FuelCalculator();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Distances : ");
		fc.setD(sc.nextDouble());
		System.out.print("Enter number of vehicles : ");
		fc.setVq(sc.nextInt());
		System.out.print("Enter consumption : ");
		fc.setC(sc.nextDouble());
		System.out.print("Enter gas's price : ");
		fc.setGp(sc.nextDouble());
		System.out.print("Number of people : ");
		fc.setP(sc.nextInt());
//		System.out.println("\nTotal distance : " + formatter.format(fc.distance()) + " * "
//				+ formatter.format(fc.vehicles_quantity()) + " = " + formatter.format(fc.total_distance())
//				+ " kilometers\n" + "Consumption : " + formatter.format(fc.consumption())+ " km/liter\n"
//				+ "Gas consumed : " + formatter.format(fc.total_distance()) + "/" + formatter.format(fc.consumption()) + " = "+ formatter.format(fc.gas_consumed()) + " liter(s)\n"
//				+ "Total price : " +formatter.format(fc.gas_consumed()) + "*" +formatter.format(fc.gas_price()) + " = "+ formatter.format(fc.total_price()) + " Baht\n" 
//				+ "Price per person : " + formatter.format(fc.total_price()) + "/"+ fc.getP() + " = "+ formatter.format(fc.price_per_person()) + " Baht");
		System.out.println(fc.result());
		sc.nextLine();
		System.out.println("\nPress Enter to exit");
		sc.nextLine();
		System.out.println("Bye");
		sc.close();
	}
}
