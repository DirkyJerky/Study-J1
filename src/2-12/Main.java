public class Main {
	public static void main (String[] args) {
		if(args.length < 4) {
			die();
		}

		long cents = Long.parseLong(args[0]) * 25 // Quarters
				 + Long.parseLong(args[1]) * 10 // Dimes
				 + Long.parseLong(args[2]) * 5 // Nickels
				 + Long.parseLong(args[3]); // Pennies

		double  dollars = cents / 100.0;
		System.out.printf("Monies: $%.2f", dollars);
	}	

	public static void die() {
		System.err.println("Usage: % quarters dimes nickels pennies");
		System.exit(1);
	}
}
