import java.util.Arrays;

public class SearchIn2DArray {
	public static void main(String[] args) {
		int[][] arr = {
				{ 1, 2, 3, 45 },
				{ 23, 80, 4, 7 },
				{ 78, 324, 5 }
		};
		int target = 324;
		int[] res = searchIn2d(arr, target);

		System.out.println("Elemnt Found At " + Arrays.toString(res));

	}

	static int[] searchIn2d(int arr[][], int target) {

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] == target) {
					return new int[] { row, col };
				}
			}
		}
		return new int[] {};
	}

}
