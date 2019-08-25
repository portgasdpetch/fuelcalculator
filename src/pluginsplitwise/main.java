package pluginsplitwise;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		double d, c, gp;
		int vq, p;
		FuelCalculator fc = new FuelCalculator();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Distances : ");
		fc.setD(sc.nextDouble());
		System.out.print("Enter number of vehicles : ");
		fc.setVq(sc.nextInt());
		System.out.print("Enter comsumption : ");
		fc.setC(sc.nextDouble());
		System.out.print("Enter gas's price : ");
		fc.setGp(sc.nextDouble());
		System.out.print("Number of people : ");
		fc.setP(sc.nextInt());
		sc.close();
		NumberFormat formatter = new DecimalFormat("#,##0.##");
		formatter.setRoundingMode(RoundingMode.HALF_UP);
		System.out.println("Total Distance : "+formatter.format(fc.distance())+" * "+formatter.format(fc.vehicles_quantity())+" = "+formatter.format(fc.total_distance()));
	}
}
