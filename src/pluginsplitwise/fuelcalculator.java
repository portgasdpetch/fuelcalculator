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
		double gp;
		int p;
		Scanner sc = new Scanner(System.in);
			System.out.print("Enter Distances : ");
			d=sc.nextDouble();
			System.out.print("Enter number of vehicles : ");
			v=sc.nextInt();
			System.out.print("Enter comsumption : ");
			c=sc.nextDouble();
			System.out.print("Enter gas's price : ");
			gp=sc.nextDouble();
			System.out.print("Number of people : ");
			p=sc.nextInt();
			double td = d*v;
			double gs = (td/c);
			double tp = gs*gp;	
			double ppp = (tp/p);
			sc.close(); 
			
			NumberFormat formatter = new DecimalFormat("#0.00");
			formatter.setRoundingMode(RoundingMode.HALF_UP);
			 
			System.out.print("Distance : " + d + " kilometers * " + v + " vehicle(s) \n" + "Total Distances : "+d + "*" +v+" = "+(formatter.format(td))+" kilometers \nConsumption : " + c + " km/liter"
					+ "\nGas Consumed : " + (formatter.format(td)) + "/" + c +" = "+ (formatter.format(gs)) +" liter(s)\nTotal Price : " + gp + "*" + (formatter.format(gs)) + " = " 
					+(formatter.format(tp)) + " Baht\nPrice per person : " + (formatter.format(ppp))+" Baht");
	}
}
