public class SearchInRange {
	public static void main(String[] args) {
		int[] nums = { 12, 234, 967, 2, 45, 78, 3, 5, 645, 12, 3, 546, 53, 3, 125, 23, 4, 23, 5234, 1242345, 345 };
		int target = 645;

		int res = inRange(nums, target, 10, nums.length - 1);
		if (res == -1) {
			System.out.println("Element Not Found");
			return;
		}
		System.out.println("Element Found");

	}

	static int inRange(int[] arr, int target, int start, int end) {
		if (arr.length == 0) {
			return -1;
		}
		for (int i = start; i < end; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

}
