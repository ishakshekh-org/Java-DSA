public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 12, 2, 334, 34, 5567, 234, 125, 53, 5, 4, 9 };

		System.out.println(linearSearch(arr, 12));

	}

	public static int linearSearch(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}

		// loop
		for (int index = 0; index < arr.length; index++) {
			int elem = arr[index];

			if (elem == target) {
				return index;
			}
		}
		return -1;

	}

}