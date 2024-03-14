import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Size of Array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.println("Enter Elements of Array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter The Element of Array : ");
			int val = sc.nextInt();
			arr[i] = val;
		}

		System.out.println("your Array is :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
