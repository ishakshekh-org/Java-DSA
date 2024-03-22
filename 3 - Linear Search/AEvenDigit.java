// ! Leet Code
// ! Find The Numbers with Even Numbers of Digit

public class AEvenDigit {
	public static void main(String[] args) {
		int[] nums = { 12, 45, 534, 3453, 412, 463, 62123, 323, 536, 2, 4, 6, 8, 0, 46, 1232 };
		// System.out.println("The Even Numbers Present in array is : " +
		// findEven(nums));
		int res = findNumbers(nums);
		System.out.println(res);
	}

	// * find numbers which have Even number of Digits
	static int findNumbers(int[] nums) {
		int count = 0;

		for (int num : nums) {

			if (isEvenNumberofDigits(num)) {
				count++;
			}
		}

		return count;
	}

	// * check number is evene or not
	static boolean isEvenNumberofDigits(int num) {
		// int numberOfDigits = countDigits(num);
		int numberOfDigits = countDigitsWithLog(num);
		if (numberOfDigits % 2 == 0) {
			return true;
		}
		return false;
	}

	// * count digits in number
	static int countDigits(int num) {
		// & Coverting negative to postive
		if (num < 0) {
			num = num * -1;
		}

		// & Converting Zero as Odd Number
		if (num == 0) {
			return 1;
		}

		int count = 0;
		while (num > 0) {
			count++;
			num = num / 10;
		}

		return count;
	}

	// * With Using log We can optimize the code to run fast
	static int countDigitsWithLog(int num) {
		if (num < 0) {
			num = num * -1;
		}

		return (int) (Math.log10(num)) + 1;
	}

}
