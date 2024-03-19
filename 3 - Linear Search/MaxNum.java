public class MaxNum {
	public static void main(String[] args) {
		int[][] arr = {
				{ 1, 34, 345, 23, 546 },
				{ 456, 23456, 213, 546, 44 },
				{ 789, 5, 9, 89, 297, 57, 967567 }
		};

		int res = maxNumber(arr);
	}

	static int maxNumber(int[][] arr) {
		int[] maxValue = Integer.MIN_VALUE;

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] > maxValue) {
					maxValue = arr[row,col];
				}
			}
		}
		return maxValue;
	}
}
