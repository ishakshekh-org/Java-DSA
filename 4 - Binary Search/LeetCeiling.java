public class LeetCeiling {
	public static void main(String[] args) {
		char[] arr = { 'a', 'b', 'c', 'd' };
		char target = 'x';
		System.out.println(nextSmallestCharcter(arr, target));
	}

	static char nextSmallestCharcter(char[] letters, char target) {
		int start = 0;
		int end = letters.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target < letters[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return letters[start % letters.length];
	}

}