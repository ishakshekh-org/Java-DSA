public class InfiniteArray {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 12, 13, 14, 15, 16, 17, 23, 24, 25, 30 };
		System.out.println(findRange(arr, 8));
	}

	static int findRange(int[] arr, int target) {

		// first find in range
		// first start with intial range of size of 2
		int start = 0;
		int end = 1;

		// applying condition to check target is inRange [i.e]- Smaller than end
		while (target > arr[end]) {
			// creating newStart because we want to use Start after for updation
			int newStart = end + 1;
			// doubling the Intial Range
			// end = previous End + Size of Box *2
			end = end + (end - start + 1) * 2;
			start = newStart;
		}

		return binarySearch(arr, start, end, target);
	}

	static int binarySearch(int[] arr, int start, int end, int target) {

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target > arr[mid]) {
				start = mid + 1;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				return mid;
			}
		}

		return -1;
	}

}