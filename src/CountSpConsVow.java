
public class CountSpConsVow {

	public static void main(String[] args) {

		String str = "java,DEVELOPER!".toUpperCase();
		System.out.println(str);
		int vowels = 0;
		int cons = 0;
		int spChar = 0;
		// count no if vowels in the string

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
				if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
					vowels++;
				else
					cons++;

			} else if (!(ch >= '0' && ch <= '9')) {
				spChar++;
			}

		}
		System.out.println("Count of vowels is: " + vowels);
		System.out.println("Count of consonants is: " + cons);
		System.out.println("Count of special chars is: " + spChar);

	}

}
