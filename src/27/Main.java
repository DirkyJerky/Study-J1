import java.time.Duration;


public class Main {
	public static void main (String[] args) throws Exception {
		if(args.length < 1) {
			die();
		}

		Duration time = Duration.ofSeconds(Long.parseLong(args[0]));

		long hours = time.toHours();
		time = time.minusHours(hours);
		
		long minutes = time.toMinutes();
		time = time.minusMinutes(minutes);
		
		long seconds = time.getSeconds();
		
		System.out.printf("Hours:Minutes:Seconds -> %d:%d:%d", hours, minutes, seconds);
	}	

	public static void die() {
		System.err.println("Usage: % seconds");
		System.exit(1);
	}
}
