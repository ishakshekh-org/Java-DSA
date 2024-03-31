public class LeetMountainArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 4, 2, 1 };
		System.out.println(peakOfMountainArray(arr));

	}

	static int peakOfMountainArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] > arr[mid + 1]) {
				// decsending part of array
				// may be answer , but look at left
				end = mid;
			} else {
				// accesending part of array
				start = mid + 1;
			}
		}
		// in end start == end and pointing to answer itself
		return start; // or end
	}

}
