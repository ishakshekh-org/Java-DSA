import java.util.ArrayList;
import java.util.Scanner;

public class MultiDiArrayList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> nums = new ArrayList<>();

		// * Initialization
		for (int i = 0; i < 5; i++) {
			nums.add(new ArrayList<>());
		}

		// * Taking User Input
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++)
				nums.get(i).add(sc.nextInt());
		}

		// * Print ArrayList
		for (int i = 0; i < nums.size(); i++) {
			System.out.println(nums.get(i));
		}
		System.out.println(nums);

	}
}
