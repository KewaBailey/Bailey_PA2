
public class Decrypter {
	
	public String decrypt(String inputNumber) {
		 // declares local variable 
		String stringElement = "";
			// loops through each input char and change to type int 	
		for(int i = 0 ; i < inputNumber.length() ; i++ ) {
			// create int (num) for new elements by subtracting 7 to each element 
			 int num = ((Integer.parseInt(inputNumber.charAt(i) + "")) - 7);
			// if the num is less than 0 add 10, reversing the modulus  	
			 if(num < 0) 
					num += 10;
		    // 
			  stringElement = stringElement + num;
		 
		}
		// rearranges the char in 4 digit number for switching and creates a new string
			  String decryptedCode = stringElement.charAt(2) + "" + stringElement.charAt(3) + 
			          "" + stringElement.charAt(0) + "" + stringElement.charAt(1) + "";
		// return decryptedCode
		return decryptedCode;
	}
	
}
