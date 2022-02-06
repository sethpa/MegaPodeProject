/***********************************************
 * Model the taxonomy of a Megapode.
 * I know, a bird is not a mammal.
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 */
package MegapodePackage;

/**
 * Bird
 * @author Nicholson.Bill
 */
public class Bird extends Mammal {
/**
 * Constructor (this comment is redundant)
 * @param weight The weight, in kilograms, of the Bird
 */
    public Bird(int weight){
//      Call the base class constructor. Note the use of the keyword super.
        super(weight);
    }
}
