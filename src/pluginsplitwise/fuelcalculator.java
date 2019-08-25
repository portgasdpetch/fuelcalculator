package pluginsplitwise;

public class FuelCalculator {
		private double d, c, gp, td, gs, tp, ppp;
		private int vq, p;
		
		
		public FuelCalculator() {
		}
		public double distance() {
			this.setD(d);
			return d;
		}
		public double consumption() {
			this.setC(c);
			return c;			
		}
		public double gas_price() {
			this.setGp(gp);
			return gp;
		}
		public int vehicles_quantity() {
			this.setVq(vq);
			return vq;
		}
		public int people() {
			this.setP(p);
			return p;
		}
		public double total_distance() {
			td = (getD()*getVq());
			return td;
		}
		public double gas_consumed() {
			gs = (td/getC());
			return gs;
		}
		public double total_price() {
			tp = (gs*getGp());
			return tp;			
		}
		public double price_per_person() {
			ppp = (tp/getP());
			return ppp;
		}
		public double getD() {
			return d;
		}
		public void setD(double d) {
			this.d = d;
		}
		public int getVq() {
			return vq;
		}
		public void setVq(int vq) {
			this.vq = vq;
		}
		public double getC() {
			return c;
		}
		public void setC(double c) {
			this.c = c;
		}
		public double getGp() {
			return gp;
		}
		public void setGp(double gp) {
			this.gp = gp;
		}
		public int getP() {
			return p;
		}
		public void setP(int p) {
			this.p = p;
		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter Distances : ");
//		d = sc.nextDouble();
//		System.out.print("Enter number of vehicles : ");
//		v = sc.nextInt();
//		System.out.print("Enter comsumption : ");
//		c = sc.nextDouble();
//		System.out.print("Enter gas's price : ");
//		gp = sc.nextDouble();
//		System.out.print("Number of people : ");
//		p = sc.nextInt();
//		double td = d * vq;
//		double gs = (td / c);
//		double tp = gs * gp;
//		double ppp = (tp / p);

//		NumberFormat formatter = new DecimalFormat("#,##0.##");
//		formatter.setRoundingMode(RoundingMode.HALF_UP);

//		System.out.println("Distance : " + (formatter.format(d)) + " kilometers * " + (formatter.format(v))
//				+ " vehicle(s) \n" + "Total Distances : " + (formatter.format(d)) + "*" + (formatter.format(v)) + " = "
//				+ (formatter.format(td)) + " kilometers \nConsumption : " + (formatter.format(c)) + " km/liter"
//				+ "\nGas Consumed : " + (formatter.format(td)) + "/" + (formatter.format(c)) + " = "
//				+ (formatter.format(gs)) + " liter(s)\nTotal Price : " + (formatter.format(gp)) + "*"
//				+ (formatter.format(gs)) + " = " + (formatter.format(tp)) + " Baht\nPrice per person : "
//				+ (formatter.format(ppp)) + " Baht");
//		
//		sc.nextLine();
//		System.out.println("\nPress Enter to exit");
//		sc.nextLine();
//		System.out.println("Bye");
//		sc.close();		
}
