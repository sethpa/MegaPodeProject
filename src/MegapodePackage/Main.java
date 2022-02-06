/*
 *                                                                Main.java
 * Main class
 * This is the entry point for the project.
 * I added this line to show how to update a remote repo
 */

package MegapodePackage;

/**
 * The demonstration main() for the Megapode project
 * @author Nicholson.Bill
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Megapode bob, carol;   // Declare the objects

//      bob is an object that contains all the properties and methods of
//        bird, mammal, animal objects as well.
        bob = new Megapode(0);          // Instantiate the object
        carol = new Megapode(123);      // Instantiate the object
        
        carol.Hello();		// Call a method inherited from the Animal Class
        
        Lizard gary = new Lizard(4);	// Instantiate and declare
    }
}
