
// Import scanner class
import java.util.Scanner;

// Create BMICalculator public class
public class BMICalculator {
	/* Create a boolean called metric and create variables height and
	   Weight as type int, bmi as float and a string (cat).
	 */

	int weight, height; 
	float bmi;
	String cat;
	boolean invalidInput = false; 
	boolean shouldUseImperial;
	// Takes the readUnitType and readMeasurementData method 
	public void readUserData() {
		
		readUnitType();
		readMeasurementData(shouldUseImperial);
	}

	private void readUnitType() {
		//Create a boolean for this method that is used in the if statement below

		/*Do while loop with print statement for user letter input I for Imperial
		or M for Metric */
		do{
			System.out.println("Choose either Imperial or Metric calculator. I for Imperial M for Metric");
			Scanner sc = new Scanner(System.in);
			String iorM = sc.nextLine();

			if(iorM.compareToIgnoreCase("M") == 0) {
				invalidInput = false;
				shouldUseImperial = false;
				//readMeasurementData(true);
			}
			else if(iorM.compareToIgnoreCase("I") == 0) {
				invalidInput = false;
				shouldUseImperial = true;
				//readMeasurementData(false);
				

			}

			else {
				invalidInput = true;
			
			}
		} while(invalidInput);

	}
	
	// Takes the readMetricData and readImperialData methods
	private void readMeasurementData(boolean metric) {
		  
		if(metric) { 
			readMetricData();			
		}
		else {
			readImperialData();
		}
	}

	private void readMetricData() {
		//prompts user to enter height for metric 
		do {
			System.out.println("Enter height : ");
			Scanner sc = new Scanner(System.in);
			int userInput = Integer.parseInt(sc.nextLine());

			if(userInput > 0) {
				invalidInput = false;
				 setHeight(userInput);
				
			}
			else {
				invalidInput = true;
			}
		}while(invalidInput);
		//prompts user to enter weight for metric
		do {
			System.out.println("Enter weight : ");
			Scanner sc = new Scanner(System.in);
			int userInput = Integer.parseInt(sc.nextLine());
			if(userInput > 0) {
				invalidInput = false;
				setWeight(userInput);
				
			}
			else {
				invalidInput = true;
			}
		}while(invalidInput);
	}



	private void readImperialData() {
		do {
			System.out.println("Enter height : ");
			Scanner sc = new Scanner(System.in);
			int userInput = Integer.parseInt(sc.nextLine());
			
			if(userInput > 0) {
				invalidInput = false;
				  setHeight(userInput);
				
			}
			else {
				invalidInput = true;
			}
		}while(invalidInput);
		//prompts user to enter weight for metric
		do {
			System.out.println("Enter weight : ");
			Scanner sc = new Scanner(System.in);
			int userInput = Integer.parseInt(sc.nextLine());
		
			if(userInput > 0) {
				invalidInput = false;
				setWeight(userInput);
				
			}
			else {
				invalidInput = true;
			}
		}while(invalidInput);
	}

	public void calculateBmi() { 
            
		if(shouldUseImperial) {
			bmi = getBmiMetric();
			
		}
		else {
			bmi = getBmiImperial();
		}
		
		calculateBmiCategory();
	}


	private void calculateBmiCategory() {
		// category if statements. Basically tells user if they or Underweight, Normal weight
		// Overweight or Obese
		if(bmi <= 18.5) {cat = "Underweight";}
		else if(bmi >= 18.5 && bmi <= 24.9) {cat = "Normal weight ";}
		else if(bmi >= 25 && bmi <= 29.9) {cat = "Overweight";}
		else { cat = "Obesity";}

	}

	public void displayBmi() {
		// display the print statements for bmi and bmi category
		System.out.println("Your BMI is " + bmi);
		System.out.println("Your category is " + cat);


	}

	public int getWeight() {
		return weight;
	}

	public int getHeight() {
		return height;

	}
	// method that passes the user input and sets the height and weight
	private void setHeight(int h) {
		height = h;
	}

	private void setWeight(int w) {
		weight = w;
	}
	//
	public float getBmi() {
		return bmi;

	}

	public String getBmiCategory() {
		return cat; 
	}

	public float getBmiMetric() {

		float bmiMetric = (703 * getWeight())/(getHeight()*getHeight());
		return bmiMetric;
	}

	public float getBmiImperial() {

		float bmiImperial = (getWeight())/(getHeight()*getHeight());
		return bmiImperial;
	}


}
