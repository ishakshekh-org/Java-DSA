import java.util.Arrays;

public class Swapping {
	public static void main(String[] args) {
		int[] numArr = { 1, 2, 3, 4, 5, 67, 8, 545, 8, 234, 23 };
		System.out.println(Arrays.toString(numArr));

		swap(numArr, 2, 10);
		System.out.println(Arrays.toString(numArr));
	}

	public static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

}
