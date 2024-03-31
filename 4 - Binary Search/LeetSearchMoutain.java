public class LeetSearchMoutain {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 9, 10, 8 };
		System.out.println(search(arr, 1));
	}

	static int search(int[] arr, int target) {
		int peak = peakOfArray(arr);
		int first = orderAgnostic(arr, target, 0, peak);
		if (first != -1) {
			return first;
		}

		return orderAgnostic(arr, target, peak + 1, arr.length - 1);
	}

	static int peakOfArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] < arr[mid + 1]) {
				start = mid + 1;
			} else {
				end = mid;
			}
		}
		return start;
	}

	static int orderAgnostic(int[] arr, int target, int start, int end) {

		boolean isAscending;
		if (arr[start] > arr[end]) {
			isAscending = false;
		} else {
			isAscending = true;
		}

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return mid;
			}

			if (isAscending) {
				if (arr[mid] > target) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			} else {
				if (arr[mid] > target) {
					start = mid - 1;
				} else {
					end = mid + 1;
				}
			}
		}
		return -1;
	}

}
