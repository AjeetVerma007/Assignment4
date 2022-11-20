public class RemoveDuplicates {

	public static void main(String[] args) {

		String str = "iNeuron Technology pvt ltd";
		char[] strArray = str.toCharArray();

		for (int i = 0; i < strArray.length; i++) {
			for (int j = i + 1; j < strArray.length; j++)
				//if the character is re-occuring in the string then replaced with 0
				if (strArray[i] == strArray[j]) {
					strArray[j] = '0';
				}
		}
		//converting character to String
		str= String.valueOf(strArray);
		//replacing "0"
		System.out.println(str.replace("0",""));

	}

}
