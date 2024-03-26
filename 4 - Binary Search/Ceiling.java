public class Ceiling {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 9, 14, 16, 18 };
		int target = 22;
		int res = ceiling(arr, target);
		System.out.println("Floor Of A Number");
		System.out.println("The smallest element greater or equal to " + target + " is : " + arr[res]);
	}

	public static int ceiling(int[] arr, int target) {
		// ! If the Target is larger than the Greatest element in the array itself it
		// can give error
		if (target > arr[arr.length - 1]) {
			return -1;
		}

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return start;
	}

}