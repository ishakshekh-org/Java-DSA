// Leet Code
public class AEvenDigit {
	public static void main(String[] args) {
		int[] nums = { 12, 45, 534, 3453, 412, 463, 62123, 323, 536, 2, 4, 6, 8, 0, 46, 1232, };
		System.out.println("The Even Numbers Present in array is : " + findEven(nums));
	}

	static int findEven(int[] arr) {
		int count = 0;

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 2 == 0) {
				count++;
			}
		}

		return count;
	}
}
