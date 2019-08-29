package pluginsplitwise;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class FuelCalculator {
	private double distance, consumption, gasPrice, totalDistance, totalPrice, pricePerPerson, gasConsumption, averageConsumption, eachVehicleConsumption;
	private int vehicleQuantity, people, i;
	Scanner sc = new Scanner(System.in);
	double[] ar;
	
	
	public int getVq() {
		return vehicleQuantity;
	}

	public double distanceTraveled() {
		this.setD(distance);
		return distance;
	}

	public double[] consumeVehicles() {
		ar = new double[getVq()];
		int j = 1;
		for (i = 0; i < (getVq()); i++) {
			System.out.print("Enter vehicle " + j + "'s consumption : ");
			ar[i] = (sc.nextDouble());
			j++;
		}
		return ar;
	}
	
	public void calConsump() {
		NumberFormat formatter = new DecimalFormat("#,##0.##");
		formatter.setRoundingMode(RoundingMode.HALF_UP);
		int j = 1;
		for (i = 0; i < (getVq()); i++) {
			System.out.println("\nVehicle " + j + " consumes : " + formatter.format(distanceTraveled()) + "/" + formatter.format(ar[i]) + " ~ "
			+ formatter.format(distance/ar[i])+" liter(s)");
			j++;
		}
	}
	
	public double calEachVehicleConsump() {
		for (i=0 ; i < (getVq());i++) {
		eachVehicleConsumption =  eachVehicleConsumption + (distance/ar[i]);		
		}
		return eachVehicleConsumption;
	}

	public int vehiclesAmount() {
		this.setVq(vehicleQuantity);
		return vehicleQuantity;
	}

	public double consume() {
		this.setC(consumption);
		return consumption;
	}

	public double gas_price() {
		this.setGp(gasPrice);
		return gasPrice;
	}

	public int people() {
		this.setP(people);
		return people;
	}

	public double totalDistanceTraveled() {
		totalDistance = (getD() * getVq());
		return totalDistance;
	}

	public double gasConsumed() {	
		gasConsumption = gasConsumption+calEachVehicleConsump();
		return gasConsumption;
	}

	public double total_price() {
		totalPrice = (gasConsumption * getGp());
		return totalPrice;
	}

	public double price_per_person() {
		pricePerPerson = (totalPrice / getP());
		return pricePerPerson;
	}

	public double getD() {
		return distance;
	}

	public void setD(double distance) {
		this.distance = distance;
	}

	public void setVq(int vehicleQuantity) {
		this.vehicleQuantity = vehicleQuantity;
	}

	public double getC() {
		return consumption;
	}

	public void setC(double consumption) {
		this.consumption = consumption;
	}

	public void setGp(double gasPrice) {
		this.gasPrice = gasPrice;
	}
	public double getGp() {
		return gasPrice;
	}



	public int getP() {
		return people;
	}

	public void setP(int people) {
		this.people = people;
	}
	
	public double calAvgConsumption() {
		double sum=0;
		for (i=0;i<getVq();i++) {
			sum = sum+ar[i];
		}
		averageConsumption = sum/getVq();
		return averageConsumption;
	}

	public String result() {
		NumberFormat formatter = new DecimalFormat("#,##0.##");
		formatter.setRoundingMode(RoundingMode.HALF_UP);
		String text = "\nTotal distance : " + formatter.format(distanceTraveled()) + " * "
				+ formatter.format(vehiclesAmount()) + " = " + formatter.format(totalDistanceTraveled())
				+ " kilometers\n" + "Total gas consumed : " + " "+ formatter.format(gasConsumed()) + " liter(s)\n"
				+ "Average consumption : " 	+ formatter.format(calAvgConsumption()) + " km/liter\n" 
				+ "Total price : " + formatter.format(gasConsumption) + "*" + formatter.format(getGp()) + " ~ "
				+ formatter.format(total_price()) + " Baht\n" + "Price per person : " + formatter.format(total_price())
				+ "/" + getP() + " = " + formatter.format(price_per_person()) + " Baht";
		return text;
	}
}
