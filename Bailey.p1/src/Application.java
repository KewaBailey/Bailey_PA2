
// impports scanner utlilty 

import java.util.Scanner;
// create public class called Application with main function

public class Application {

	// create main arguement 
	public static void main(String[] args) {
		// create local variable to store the user's input and creates scanner (sc)
		String num = "";
		Scanner sc = null;
		// make a while loop that checks is the input is a 4 digits 
		while(num.length() != 4) {
			// asks user input 
			System.out.print("Enter four digit number : ");
			// intializing the scanner
			sc = new Scanner(System.in);
			// set users input to local variable "num" 
			num = sc.nextLine();
			//prints error message if user's input is incorrect
			if(num.length() != 4) {
				
				System.out.println("Invalid input. Requires a 4 digit input to run \n please enter a 4 digit number");
							
			}
			
		}
		
	   // create the Encrypter object from Encrypter class
		Encrypter encryption = new Encrypter();
	   // call the encrypt method and pass the number
		String encryptedCode = encryption.encrypt(num); 
	   // print out the encrypted value 
		System.out.println("Encrypted value : " + encryptedCode);
       // create a decrypter object 
		Decrypter decryption = new Decrypter();
	   // call the decrypt method  and pass the number
		String decryptedCode = decryption.decrypt(encryptedCode);
	   // print out the decrypted value
		System.out.println("Decrypted value : " + decryptedCode);
		
		
		
		

	}

}
