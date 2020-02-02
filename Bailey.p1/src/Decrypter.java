
public class Decrypter {
	
	public String decrypt(String inputNumber) {
			String stringElement = "";
			
		for(int i = 0 ; i < inputNumber.length() ; i++ ) {
				
			 int num = ((Integer.parseInt(inputNumber.charAt(i) + "")) - 7);
				
			 if(num < 0)
					num += 10;
				
			  stringElement = stringElement + num;
		 
		}
			
			  String decryptedCode = stringElement.charAt(2) + "" + stringElement.charAt(3) + 
			          "" + stringElement.charAt(0) + "" + stringElement.charAt(1) + "";
			
		return decryptedCode;
	}
	
}
