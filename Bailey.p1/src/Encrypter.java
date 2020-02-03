

public class Encrypter { 
	
  public String encrypt(String inputNumber) {
	 // declares local variable  
	 String stringElement = "";
	   // loops through each input char and change to type int 
	   for(int i = 0 ; i < inputNumber.length() ; i++) {
		   // create int (nu)m for new elements added by 7 add modulus by 10
		   int num = ((Integer.parseInt(inputNumber.charAt(i)+""))+7)%10;	
		   
		   stringElement = stringElement + num;
	   }
	   // rearranges the char in 4 digit number for switching and creates a new string
	   String encryptedCode = stringElement.charAt(2) + "" + stringElement.charAt(3) + 
			   "" + stringElement.charAt(0) + "" + stringElement.charAt(1) + "";
	 // returns the string 
	   return encryptedCode;
	   
	  
	  
  }

  
	

}


