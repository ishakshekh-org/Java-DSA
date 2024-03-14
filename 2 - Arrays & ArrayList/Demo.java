public class Demo {
	public static void main(String[] args) {
		// syntax
		// datatype[] var_name = new datatype[size]
		// or Directly
		// int[] rollnums = { 121, 105, 106, 92, 85 };

		// Store 5 Roll Numbers
		int[] rollNums = new int[5];
		rollNums[0] = 12;
		rollNums[1] = 12;
		rollNums[2] = 12;
		rollNums[3] = 12;
		rollNums[4] = 12;
		System.out.println(rollNums[2]);

		// string arr
		String arr[] = new String[] { "Ishak", "Shekh" };
		System.out.println(arr[1]);
	}
}
