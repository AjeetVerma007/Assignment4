
public class FindDuplicates {
	
	public static void main(String[] args) {  
        String arr = "Hello World";  
        int count;  
          
        //Converts given string into character array  
        char arr1[] = arr.toCharArray();  
          
        System.out.println("Duplicate characters in a given string: ");  
        //Counts each character present in the string  
        for(int i = 0; i <arr1.length; i++) {  
            count = 1;  
            for(int j = i+1; j <arr1.length; j++) {  
                if(arr1[i] == arr1[j] && arr1[i] != ' ') {  
                    count++;  
                    //Set string[j] to 0 to avoid printing visited character  
                    arr1[j] = '0';  
                }  
            }  
            //A character is considered as duplicate if count is greater than 1  
            if(count > 1 && arr1[i] != '0')  
                System.out.print(arr1[i]+" ");  
        }  
    }  

}
