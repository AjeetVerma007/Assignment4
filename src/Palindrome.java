
public class Palindrome {

	public static void main(String[] args) {

		
		String str = "2552";
		String fStr = "";
		for(int i=str.length()-1 ; i>=0;i--)
		{
			fStr+=str.charAt(i);
		}
		System.out.println(fStr);
		
		if(str.equals(fStr))
		{
		System.out.println("String is palindrome");
		}
		else
		System.out.println("String is not palindrome");
	}

}
