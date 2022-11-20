
public class Panagram {

	public static void main(String[] args) {

		String str = "A quick brown fox jumps over the lazy dog".toLowerCase();
		int arr[] = new int[26];
		boolean flag = false;
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {

				// System.out.print(str.charAt(i) - 97);

				arr[str.charAt(i) - 97] = 1;
				count++;
			}

		}
		for (int i : arr) {
			if (i == 0) {
				flag = true;

				break;
			}
		}
		if (flag == true) {
			System.out.println("String is not Anagram");
		} else {
			System.out.println("String is anagram");
		}

	}

}
