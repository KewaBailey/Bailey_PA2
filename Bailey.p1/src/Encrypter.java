

public class Encrypter { 
	
  public String encrypt(String inputNumber) {
	 // delcares local variable  
	 String stringElement = "";
	   // loops through each input number char 
	   for(int i = 0 ; i < inputNumber.length() ; i++) {
		   
		   int num = ((Integer.parseInt(inputNumber.charAt(i)+""))+7)%10;	
		   
		   stringElement = stringElement + num;
	   }
	   
	   String encryptedCode = stringElement.charAt(2) + "" + stringElement.charAt(3) + 
			   "" + stringElement.charAt(0) + "" + stringElement.charAt(1) + "";
	 
	   return encryptedCode;
	   
	  
	  
  }

  
	

}


