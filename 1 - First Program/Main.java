import java.util.Scanner;;

public class Main {
	public static void main(String[] ishak) {
		// ! Output Stream
		// ! Command Line Argument
		// System.out.println(ishak[0]);
		// System.out.println(ishak[1]); // * Needs Values When Compiled

		// & Defined Argument
		System.out.println("hello java");

		// ! Input Stream
		Scanner sc = new Scanner(System.in);
		sc.next(); // Takes String Without Spaces
		sc.nextLine(); // Takes String With All spaces
		sc.nextInt(); // Takes Int
		sc.nextFloat(); // Takes Float (1.2) upto 16bits
		sc.nextDouble(); // takes float upto 32bits
	}
}