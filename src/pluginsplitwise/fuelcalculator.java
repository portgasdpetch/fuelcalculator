package pluginsplitwise;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class fuelcalculator {
	public static void main(String[] args) {
		double d, c, gp;
		int v, p;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Distances : ");
		d = sc.nextDouble();
		System.out.print("Enter number of vehicles : ");
		v = sc.nextInt();
		System.out.print("Enter comsumption : ");
		c = sc.nextDouble();
		System.out.print("Enter gas's price : ");
		gp = sc.nextDouble();
		System.out.print("Number of people : ");
		p = sc.nextInt();
		double td = d * v;
		double gs = (td / c);
		double tp = gs * gp;
		double ppp = (tp / p);

		NumberFormat formatter = new DecimalFormat("#,##0.##");
		formatter.setRoundingMode(RoundingMode.HALF_UP);

		System.out.println("Distance : " + (formatter.format(d)) + " kilometers * " + (formatter.format(v))
				+ " vehicle(s) \n" + "Total Distances : " + (formatter.format(d)) + "*" + (formatter.format(v)) + " = "
				+ (formatter.format(td)) + " kilometers \nConsumption : " + (formatter.format(c)) + " km/liter"
				+ "\nGas Consumed : " + (formatter.format(td)) + "/" + (formatter.format(c)) + " = "
				+ (formatter.format(gs)) + " liter(s)\nTotal Price : " + (formatter.format(gp)) + "*"
				+ (formatter.format(gs)) + " = " + (formatter.format(tp)) + " Baht\nPrice per person : "
				+ (formatter.format(ppp)) + " Baht");
		
		sc.nextLine();
		System.out.println("\nPress Enter to exit");
		sc.nextLine();
		System.out.println("Bye");
		sc.close();		
	}
}
