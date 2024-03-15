package Array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrays {
	public static void main(String[] ishak) {

		/*
		 * 1 2 3
		 * 4 5 6
		 * 7 8 9
		 * & // & Number Of Rows is Mandotary
		 */

		int[][] newArr = {
				{ 1, 2 }, { 4, 5, 6, 3, 0 }, { 7 }
		};

		System.out.println("newArray : Output");
		for (int row = 0; row < newArr.length; row++) {
			for (int col = 0; col < newArr[row].length; col++) {
				System.out.print(newArr[row][col]);
			}
			System.out.println();
		}

		// Input
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][2];

		System.out.println("Enter Array Values : ");
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = sc.nextInt();
			}
			System.out.println();
		}

		System.out.println("arr : Output");
		// for (int row = 0; row < arr.length; row++) {
		// for (int col = 0; col < arr[row].length; col++) {
		// System.out.print(arr[row][col]);
		// }
		// System.out.println();
		// }

		for (int row = 0; row < arr.length; row++) {
			System.out.println(Arrays.toString(arr[row]));
		}

	}

}
