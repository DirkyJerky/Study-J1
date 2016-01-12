public class Main {
	public static void main (String[] args) {
		if(args.length < 1) {
			die();
		}
	}	

	public static void die() {
		System.err.println("Usage: % arg1");
		System.exit(1);
	}
}
