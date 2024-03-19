public class MinNumber {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, -10, 2, 334, 34, 5567, 234, 125, 53, 5, 4, 9 };
		int res = minNum(arr);

		if (res == -1) {
			System.out.println("Enter VAlid Array");
		}
		System.out.println("The Smallest Element is : " + res);

	}

	static int minNum(int[] arr) {
		if (arr.length == 0) {
			return -1;
		}

		int answer = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < answer) {
				answer = arr[i];
				return answer;
			}
		}

		return -1;
	}
}
