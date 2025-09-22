package questions;

//Abstract class Vaccine
abstract class Vaccine {
 // Variables
 int age;
 String nationality;
 boolean firstDoseTaken = false;
 boolean secondDoseTaken = false;

 // Constructor to initialize variables
 public Vaccine(int age, String nationality) {
     this.age = age;
     this.nationality = nationality;
 }

 // Concrete method for first dose
 public void firstDose() {
     if (nationality.equalsIgnoreCase("Indian") && age >= 18 && !firstDoseTaken) {
         System.out.println("First dose administered successfully.");
         System.out.println("Please pay Rs. 250.");
         firstDoseTaken = true;
     } else if (firstDoseTaken) {
         System.out.println("You have already taken the first dose.");
     } else {
         System.out.println("You are not eligible for the first dose.");
     }
 }

 // Concrete method for second dose
 public void secondDose() {
     if (firstDoseTaken && !secondDoseTaken) {
         System.out.println("Second dose administered successfully.");
         System.out.println("Please pay Rs. 250.");
         secondDoseTaken = true;
     } else if (!firstDoseTaken) {
         System.out.println("You need to take the first dose before taking the second dose.");
     } else {
         System.out.println("You have already taken the second dose.");
     }
 }

 // Abstract method for booster dose
 public abstract void boosterDose();
}

//Concrete implementation class VaccinationSuccessful
class VaccinationSuccessful extends Vaccine {
 public VaccinationSuccessful(int age, String nationality) {
     super(age, nationality);
 }

 // Implementation of booster dose method
 @Override
 public void boosterDose() {
     if (firstDoseTaken && secondDoseTaken) {
         System.out.println("Booster dose administered successfully.");
         System.out.println("Please pay Rs. 250.");
     } else {
         System.out.println("You need to complete both doses before taking the booster dose.");
     }
 }
 
}


public class vaccination {

	public static void main(String[] args) {
		// Create an object of VaccinationSuccessful
        Vaccine vaccine = new VaccinationSuccessful(18, "Indian");

        // Take first dose
        vaccine.firstDose();

        // Take second dose
        vaccine.secondDose();

        // Take booster dose
        vaccine.boosterDose();

	}

}
