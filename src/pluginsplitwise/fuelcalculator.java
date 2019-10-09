package pluginsplitwise;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class FuelCalculator {
	private double gasPrice, totalDistance, totalPrice, pricePerPerson, gasConsumption, averageConsumption,
			eachVehicleConsumption;
	private int vehicleQuantity, people, i;
	Scanner sc = new Scanner(System.in);
	double[] vd, vc;

	public int getVehicleQuantity() {
		return vehicleQuantity;
	}



	public double[] vehicleDistances() {
		vd = new double[getVehicleQuantity()];
		int j = 1;
		for (i = 0; i < (getVehicleQuantity()); i++) {
			System.out.print("Enter vehicle " + j + "'s distances : ");
			vd[i] = (sc.nextDouble());
			j++;
		}
		return vd;
	}

	public double[] consumeVehicles() {
		vc = new double[getVehicleQuantity()];
		int j = 1;
		for (i = 0; i < (getVehicleQuantity()); i++) {
			System.out.print("Enter vehicle " + j + "'s consumption : ");
			vc[i] = (sc.nextDouble());
			j++;
		}
		return vc;
	}

	public void calDistance() {
		int j = 1;
		for (i = 0; i < getVehicleQuantity(); i++) {
			System.out.println("\nVehicle " + j + "travels " + vd[i] + "kilometers");
		}
	}

	public void calConsump() {
		NumberFormat formatter = new DecimalFormat("#,##0.##");
		formatter.setRoundingMode(RoundingMode.HALF_UP);
		int j = 1;
		for (i = 0; i < (getVehicleQuantity()); i++) {
			System.out.println("\nVehicle " + j + " consumes : " + formatter.format(vd[i]) + "/"
					+ formatter.format(vc[i]) + " ~ " + formatter.format(vd[i] / vc[i]) + " liter(s)");
			j++;
		}
	}

	public double calEachVehicleConsump() {
		for (i = 0; i < (getVehicleQuantity()); i++) {
			eachVehicleConsumption = eachVehicleConsumption + (vd[i] / vc[i]);
		}
		return eachVehicleConsumption;
	}

	public int vehiclesAmount() {
		this.setVehicleQuantity(vehicleQuantity);
		return vehicleQuantity;
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
		double sum = 0;
		for (i = 0; i < getVehicleQuantity(); i++) {
			sum = sum + vd[i];
		}
		totalDistance = sum;
		return totalDistance;
	}

	public double gasConsumed() {
		gasConsumption = gasConsumption + calEachVehicleConsump();
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

	public void setVehicleQuantity(int vehicleQuantity) {
		this.vehicleQuantity = vehicleQuantity;
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
		double sum = 0;
		for (i = 0; i < getVehicleQuantity(); i++) {
			sum = sum + vc[i];
		}
		averageConsumption = sum / getVehicleQuantity();
		return averageConsumption;
	}

	public void printEachVehicleDistance() {
		NumberFormat formatter = new DecimalFormat("#,##0.##");
		formatter.setRoundingMode(RoundingMode.HALF_UP);
		System.out.print("\nTotal distance is ");
		for (i = 0; i < getVehicleQuantity(); i++) {
			String s = "+" + formatter.format(vd[i]);
			if (i == 0) {
				System.out.print(s.substring(1));
			} else {
				System.out.print(s);
			}
		}

		System.out.print(" = " + formatter.format(totalDistanceTraveled()) + " kilometers");
	}

	public void printAvgConsumption() {
		NumberFormat formatter = new DecimalFormat("#,##0.##");
		formatter.setRoundingMode(RoundingMode.HALF_UP);
		System.out.print("\nAverage consumption : (");
		for (i = 0; i < getVehicleQuantity(); i++) {
			String s = "+" + formatter.format(vc[i]);
			if (i == 0) {
				System.out.print(s.substring(1));
			} else {
				System.out.print(s);
			}
		}

		System.out.print(")/" + getVehicleQuantity() + " = " + formatter.format(calAvgConsumption()) + " km/liter\n");
	}

	public void printTotalGasConsume() {
		NumberFormat formatter = new DecimalFormat("#,##0.##");
		formatter.setRoundingMode(RoundingMode.HALF_UP);
		System.out.print("\nTotal gas consumed : ");
		for (i = 0; i < getVehicleQuantity(); i++) {
			String s = "+" + formatter.format(vd[i]/vc[i]);
			if (i==0) {
				System.out.print(s.substring(1));
			} else {
				System.out.print(s);
			}
		}
		System.out.print(" = " + formatter.format(gasConsumed()) + " liter(s)\n");
	}

	public void printEachVehicleConsume() {
		NumberFormat formatter = new DecimalFormat("#,##0.##");
		formatter.setRoundingMode(RoundingMode.HALF_UP);
		int j = 1;
		for (i = 0; i < getVehicleQuantity(); i++) {
			System.out.println("\nVehicle " + j + "'s gasoline price is " + formatter.format(vd[i] / vc[i]) + "*"
					+ formatter.format(getGp()) + " = " + formatter.format((vd[i] / vc[i]) * getGp()) + " baht");
			j++;
		}
	}
	
	public void printTotalPrice() {
		NumberFormat formatter = new DecimalFormat("#,##0.##");
		formatter.setRoundingMode(RoundingMode.HALF_UP);
		System.out.print("\nTotal price : ");
		for (i = 0; i < getVehicleQuantity(); i++) {
			String s = "+" + formatter.format(vd[i] / vc[i] * getGp());
			if (i == 0) {
				System.out.print(s.substring(1));
			} else {
				System.out.print(s);
			}
		}
		System.out.print(" = " + formatter.format(total_price()) + " Baht\n");
	}

	public String printPricePerPerson() {
		NumberFormat formatter = new DecimalFormat("#,##0.##");
		formatter.setRoundingMode(RoundingMode.HALF_UP);
		String text3 = "Price per person : " + formatter.format(total_price()) + "/" + getP() + " = "
				+ formatter.format(price_per_person()) + " Baht";
		return text3;
	}
}
