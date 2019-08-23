package pluginsplitwise;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class fuelcalculator {
	public static void main (String[] args){
		double d;
		int v;
		double c;
		double g;
		int p;
		Scanner sc = new Scanner(System.in);
			System.out.print("Enter Distances : ");
			d=sc.nextDouble();
			System.out.print("Enter number of vehicles : ");
			v=sc.nextInt();
			System.out.print("Enter comsumption : ");
			c=sc.nextDouble();
			System.out.print("Enter gas's price : ");
			g=sc.nextDouble();
			System.out.print("Number of people : ");
			p=sc.nextInt();
			double td = d*v;
			String.format("%.2f", td);
			double tp = (td/c)*g;		
			String.format("%,.2f", tp);
			double ppp = (tp/p);
			String.format("%.2f", ppp);
			sc.close(); 
			
			NumberFormat formatter = new DecimalFormat("#0.00");
			formatter.setRoundingMode(RoundingMode.HALF_UP);
			 
			System.out.print("distance : " + d + " kilometers * " + v + " vehicle(s) \n" + "total distances : "+d + "*" +v+" = "+(formatter.format(td))+"\nconsumption : " + c + " km/liter"
					+ "Total price : " + (formatter.format(tp)) + "\nPrice per person : " + (formatter.format(ppp)));
	}
}
