package festival;

public class no2 {

	public static void main(String[] args) {

		String names[] = { "Queen", "Tod", "Kim" };
	
		findkim(names);

	}

	private static void findkim(String[] names) {
		if (names.equals("Kim")) {
			System.out.println("김서방은 3에 있다");
		} else if (names.equals("Tod")) {
			System.out.println("토드는 2에 있다");
		} else if (names.equals("Queen")) {
			System.out.println("퀸은 1에 있다");
		}4

	}
}
