
public class Main {

	public static void main(String[] args) {
		p("Name", "Geoff");
		p("Birthday", "Oct 18 1998");
		p("Hobbies", "Computing");
		p("Book", "Hunger Games");
		p("Movie", "Guardians of the Galaxy");
	}
	
	public static void p(String item, String content) {
		System.out.println(item + ": " + content);
	}

}
