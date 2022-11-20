import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String str1 = "developer";
		String str2 = "evedloper";
		char[] str1Arr = str1.toCharArray();
		char[] str2Arr = str2.toCharArray();
		// sorting the arrays
		Arrays.sort(str1Arr);
		Arrays.sort(str2Arr);

		// converting arrays to string
		if (String.valueOf(str1Arr).equals(String.valueOf(str2Arr))) {
			System.out.println("String is Anagram");
		} else {
			System.out.println("String is not Anagram");
		}
	}

}
