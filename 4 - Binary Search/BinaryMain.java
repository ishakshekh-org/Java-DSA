public class BinaryMain {
	public static void main(String[] args) {
		int[] arr = { -10, -5, -2, 1, 0, 2, 4, 6, 7, 9, 12, 45, 67, 91 };
		int target = 45;

		int result = binarySearch(arr, target);
		System.out.println("Elemnt Found At : " + result);
	}

	// return index
	public static int binarySearch(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			// ! might be possile for large array that ( start + end ) value will execced
			// the range of int data type
			// int mid = (start + end) / 2;
			int mid = start + (end - start) / 2; // * better way to not execced the int limit

			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}

		}
		return -1;
	}

}
