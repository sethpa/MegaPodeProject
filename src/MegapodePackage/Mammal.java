/***********************************************
 * Model the taxonomy of a Megapode.
 * I know, a bird is not a mammal.
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 */
package MegapodePackage;

/**
 * Mammal
 * Is this a base class or a derived class?
 * @author Nicholson.Bill
 */
public class Mammal extends Animal {

    /**
     * Constructor
     * @param weight The weight, in kilograms, of the Mammal
     */
    Mammal(int weight)
    {
//      Call the base class constructor. Note the use of the keyword super.
        super(weight);
    }
}
