public class LeetFirstAndLastTargetPos {
	public static void main(String[] args) {
		int arr[] = { 5, 7, 7, 7, 7, 8, 8, 10 };
		int target = 7;

		System.out.println(hasLastAndFirst(arr, target));
	}

	static int[] hasLastAndFirst(int[] nums, int target) {
		int[] ans = { -1, -1 };
		// check for first occurence if target is first

		ans[0] = search(nums, target, true);
		ans[1] = search(nums, target, false);

		System.out.println(ans);
		return ans;
	}

	// returns the index value of target
	static int search(int[] nums, int target, boolean findStartIndex) {
		int ans = -1;
		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target > nums[mid]) {
				start = mid + 1;
			} else if (target < nums[mid]) {
				end = mid - 1;
			} else {
				ans = mid;
				if (findStartIndex) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return ans;

	}

}
