class OrderAgnostic {
	public static void main(String[] args) {
		int[] arr = { -10, -5, -2, 1, 0, 2, 4, 6, 7, 9, 12, 45, 67, 91 };
		System.out.println(orderAgnosticBinarySearch(arr, 9));
		int[] arr2 = { 91, 89, 76, 65, 54, 46, 32, 22, 10, 5, 2, -2, -10 };
		System.out.println(orderAgnosticBinarySearch(arr2, 89));

	}

	static int orderAgnosticBinarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		// find weather array is ascending or Desending
		boolean isAscending;
		if (arr[start] < arr[end]) {
			isAscending = true;
		} else {
			isAscending = false;
		}

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return mid;
			}

			if (isAscending) {
				if (target < mid) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (target < mid) {
					start = mid - 1;
				} else {
					end = mid + 1;
				}
			}
		}
		return -1;
	}
}
