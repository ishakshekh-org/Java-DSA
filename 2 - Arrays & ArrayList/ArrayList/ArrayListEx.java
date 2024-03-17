import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		// list.add(1);
		// list.add(2);
		// list.add(3);
		// list.add(4);

		// ! return boolean according to argument passed
		// System.out.println(list.contains(23));
		// ! gives value by taking specific index
		// list.get(2);

		// user Input
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter Value: ");
			list.add(sc.nextInt());
		}

		// Print Values
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); // here list[i] will not Work , Use list [.get()] method
		}

	}
}
