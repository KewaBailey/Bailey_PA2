
// import scanner class
import java.util.Scanner;

// create BMICalculator public class
public class BMICalculator {
	// create a boolean called metric and create variables 
	boolean metric = false;
	int weight, height; 
	float bmi;
	String cat;
	
	public void readUserData() {

		readUnitType();
		readMeasurementData();
	}

	private void readUnitType() {
		boolean vaild = true;
		do{
			
			System.out.println("Choose either Imperial or Metric calculator. I for Imperial M for Metric");
			Scanner sc = new Scanner(System.in);
			String iorM = sc.nextLine();
			if(iorM.compareTo("M") == 0 || iorM.compareTo("I") == 0) {
				vaild = false;
				
			}
			metric = ("M" == iorM);
			
			
		} while(vaild);
		
		
		
	}

	private void readMeasurementData() {
		if(metric) { 
			readMetricData();			
		}
		else {
			readImperialData();
		}
	}

	private void readMetricData() {
		System.out.println("Enter height : ");
		Scanner sc = new Scanner(System.in);
		if(Integer.parseInt(sc.nextLine()) < 0) {
			return;
		}
		setHeight(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter weight : ");
		if(Integer.parseInt(sc.nextLine()) < 0) {
			return;
		}
		setWeight(Integer.parseInt(sc.nextLine()));
	}

	private void readImperialData() {
		System.out.println("Enter height : ");
		Scanner sc = new Scanner(System.in);
		if(Integer.parseInt(sc.nextLine()) < 0) {
			return;
		}
		setHeight(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter weight : ");
		if(Integer.parseInt(sc.nextLine()) < 0) {
			return;
		}
		setWeight(Integer.parseInt(sc.nextLine()));		
	}

	public void calculateBmi() {

		if (metric) {
			bmi = (703 * getWeight())/(getHeight()^2);

		}
		else {
			bmi = (getWeight())/(getHeight()^2);
		}

		calculateBmiCategory();
	}


	private void calculateBmiCategory() {
		if(bmi <= 18.5) {cat = "Underweight";}
		if(bmi >= 18.5 || bmi <= 24.9) {cat = "Normal weight ";}
		if(bmi >= 25 || bmi <= 29.9) {cat = "Overweight";}
		if(bmi > 30) {cat = "Obesity";}

	}

	public void displayBmi() {
		System.out.println("Your BMI is " + bmi);
		System.out.println("Your category is " + cat);


	}

	public int getWeight() {
		return weight;
	}

	public int getHeight() {
		return height;

	}

	private void setHeight(int h) {
		height = h;
	}

	private void setWeight(int w) {
		weight = w;
	}

	public float getBmi() {
		return bmi;

	}

	public String getBmiCategory() {
		return cat; 
	}

}
