public class Main {
	public static void main (String[] args) {
		if(args.length < 3) {
			die();
		}

		int[] sideLengths = new int[3];
		
		for(int i = 0; i < 3; i++) {
			sideLengths[i] = Integer.parseInt(args[i]);
		}
		
		System.out.printf("Heron's Area: %f", herons(sideLengths));
	}	
	
	public static double herons(int[] lengths) {
		double halfPerim = 0.5 * (lengths[0] + lengths[1] + lengths[2]);
		double areaSquared = halfPerim * 
				(halfPerim - lengths[0]) * 
				(halfPerim - lengths[1]) * 
				(halfPerim - lengths[2]);

		return Math.sqrt(areaSquared);
	}

	public static void die() {
		System.err.println("Usage: % length1 length2 length3");
		System.exit(1);
	}
}
