/***********************************************
 * Model the taxonomy of a Megapode.
 * I know, a bird is not a mammal.
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 */
package MegapodePackage;

/**
 * Megapode
 * @author Nicholson.Bill
 */
public class Megapode extends Bird {
    /**
     *
     * @param weight The weight, in kilograms, of the Megapode
     */
    public Megapode(int weight){
//      Call the base class constructor. Note the use of the keyword super.
        super(weight);  
    }
}
