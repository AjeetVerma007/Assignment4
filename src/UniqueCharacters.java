
public class UniqueCharacters {

	// spaces have not been considered for duplicate checking

	public static void main(String[] args) {

		boolean result = false;

		String str = "Race  to the mountains";
		int[] count = new int[256];
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)!=' ') // check for the spaces
			{
			count[str.charAt(i)]++; // incrementing the count of the ASCII value of the character
			}
		}

		int max = -1;

		for (int i = 0; i < str.length(); i++) {
			if (count[str.charAt(i)] > 1) { // checking if the occurrence of the character is greater than 1. to check the duplicates

				result = true;
				break;
			}
		}
		if (result)
			System.out.println("String contains duplicate charcaters");
		else
			System.out.println("String contains unique characters");
	}

}
