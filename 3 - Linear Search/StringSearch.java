public class StringSearch {
	public static void main(String[] args) {

		String name = "Ishak";
		char target = 'h';

		boolean res = searchString(name, target);
		if (res == true) {
			System.out.println("Charater is Present");
			return;
		}

		if (res == false) {
			System.out.println("Charater Not Found");
		}

	}

	static boolean searchString(String str, char target) {
		if (str.length() == 0) {
			return false;
		}

		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == target) {
				return true;
			}
		}
		return false;
	}
}
