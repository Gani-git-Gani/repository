package questions;  

// Superclass (Parent class)
class HillStations {
    // Method to describe location of hill station
    public void location() {}

    // Method to describe what the hill station is famous for
    public void famousFor() {}
}


// Subclass 1: Manali extends HillStations
class Manali extends HillStations {
    // Override the location() method of parent class
    @Override
    public void location() {
        System.out.println("Manali is in Himachal Pradesh");
    }

    // Override the famousFor() method of parent class
    @Override
    public void famousFor() {
        System.out.println("It is Famous for Hadimba Temple and adventure sports");
    }
}


// Subclass 2: Mussoorie extends HillStations
class Mussoorie extends HillStations {
    @Override
    public void location() {
        System.out.println("Mussoorie is in Uttarakhand");
    }

    @Override
    public void famousFor() {
        System.out.println("It is Famous for education institutions");
    }
}


// Subclass 3: Gulmarg extends HillStations
class Gulmarg extends HillStations {
    @Override
    public void location() {
        System.out.println("Gulmarg is in J&K");
    }

    @Override
    public void famousFor() {
        System.out.println("It is Famous for skiing");
    }
}


// Main class containing the main() method
public class HillStation {

    public static void main(String[] args) {
        System.out.println("Location is:"); 
        // Print header text

        // Create object of Manali and call its methods
        Manali manali = new Manali();  
        manali.location();   // Calls overridden location() in Manali
        manali.famousFor();  // Calls overridden famousFor() in Manali

        System.out.println(); // Prints a blank line for readability

        // Create object of Mussoorie and call its methods
        Mussoorie mussoorie = new Mussoorie();
        mussoorie.location();  // Calls overridden location() in Mussoorie
        mussoorie.famousFor(); // Calls overridden famousFor() in Mussoorie

        System.out.println();

        // Create object of Gulmarg and call its methods
        Gulmarg gulmarg = new Gulmarg();
        gulmarg.location();   // Calls overridden location() in Gulmarg
        gulmarg.famousFor();  // Calls overridden famousFor() in Gulmarg
    }
}
