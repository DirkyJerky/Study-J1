import java.time.Duration;


public class Main {
	public static void main (String[] args) throws Exception {
		if(args.length < 3) {
			die();
		}

		Duration time = Duration.ZERO
				.plusHours(Long.parseLong(args[0]))
				.plusMinutes(Long.parseLong(args[1]))
				.plusSeconds(Long.parseLong(args[2]));

		System.out.printf("Seconds: %d", time.getSeconds());
	}	

	public static void die() {
		System.err.println("Usage: % hours minutes seconds");
		System.exit(1);
	}
}
