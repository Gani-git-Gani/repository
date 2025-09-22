package questions;

import java.util.Scanner;

//Superclass Animal
class Animal {
 // Method to make a sound
 void makeSound() {
     System.out.println("The animal makes a sound.");
 }
}

//Subclass Dog that extends Animal
class Dog extends Animal {
 // Override the makeSound method
 @Override
 void makeSound() {
     System.out.println("The dog barks.");
 }
}

//Subclass Cat that extends Animal
class Cat extends Animal {
 // Override the makeSound method
 @Override
 void makeSound() {
     System.out.println("The cat meows.");
 }
}

public class multiLevelInheritance {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Create objects of each class
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Create and display Animal object");
            System.out.println("2. Create and display Dog object");
            System.out.println("3. Create and display Cat object");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Creating Animal object...");
                    animal.makeSound();
                    break;
                case 2:
                    System.out.println("Creating Dog object...");
                    dog.makeSound();
                    break;
                case 3:
                    System.out.println("Creating Cat object...");
                    cat.makeSound();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
	
	}

}
