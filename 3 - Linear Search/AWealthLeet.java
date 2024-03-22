public class AWealthLeet {
	public static void main(String[] args) {
		int[][] accounts = {
				{ 1, 2, 4 },
				{ 1, 6, 3 },
				{ 6, 4, 9 },
		};

		System.out.println(maximumWealth(accounts));
	}

	@SuppressWarnings("unused")
	static int maximumWealth(int[][] arr) {

		int answer = Integer.MIN_VALUE;

		for (int person = 0; person < arr.length; person++) {
			int sum = 0;
			for (int account = 0; account < arr[person].length; account++) {
				sum += arr[person][account];
			}
			if (sum > answer) {
				answer = sum;
			}
		}
		return answer;
	}
}
