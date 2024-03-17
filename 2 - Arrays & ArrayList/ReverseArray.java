import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int[] numArr = { 1, 2, 3, 4, 5, 67, 8, 545, 8, 234, 23 };

		System.out.println(Arrays.toString(numArr));
		revrseArr(numArr);
		System.out.println(Arrays.toString(numArr));
	}

	public static void revrseArr(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) { // cheking if the end value is larger than start or not
			swap(arr, start, end); // Swapping the Two Start and End Values
			start++;
			end--;
		}

	}

	public static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

}
