public class MaxVal {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 54, 54645, 56, 123, 323232334 };

		System.out.println(maxValue(nums)); // * Gives Maximum Value
		System.out.println(maxCheckRange(nums, 1, 7)); // * Gives max Value in Provided Range
	}

	public static int maxValue(int arr[]) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) { // cheking if intrabale value is greater than the last max Value
				max = arr[i];
			}
		}
		return max;
	}

	public static int maxCheckRange(int[] arr, int minIndex, int maxIndex) {
		int maxNum = arr[0];

		for (int i = minIndex; i < maxIndex; i++) {
			if (arr[i] > maxNum) {
				maxNum = arr[i];
			}
		}
		return maxNum;
	}

}
