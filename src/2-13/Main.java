import java.util.Random;

public class Main {
	public static void main (String[] args) {
		Random rand = new Random();
		//  Goal :: ###-###-####

		// First ###, no 8 or 9
		int areaCode = rand.nextInt(8) * 100
				+ rand.nextInt(8) * 10
				+ rand.nextInt(8);

		// Second ###, <= 742
		int cityCode = rand.nextInt(742 + 1);
		
		// Last ####
		int idCode = rand.nextInt(10000);

		System.out.printf("%03d-%03d-%04d", areaCode, cityCode, idCode);
	}	
}
