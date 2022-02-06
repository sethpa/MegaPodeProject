/***********************************************
 * Model the taxonomy of a Megapode.
 * I know, a bird is not a mammal.
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 */
package MegapodePackage;

/**
 * This is our base class for the inheritance example.
 * @author Nicholson.Bill
 */
public class Animal {
    /**
     * weight of the Animal
     */
    private int weight;
    /**
     * A public method that will be inherited
     */
    public void Hello() {
        System.out.print("I am an animal");
    }
    /**
     * Constructor
     * @param weight The weight, in kilograms, of the Animal
     */
    public Animal(int weight){
        this.weight = weight;
        System.out.println("\nHello from the Animal constructor");
    }
    /**
     * get the weight 
     * @return weight
     */
    public int getWeight() {return weight;}
    /**
     * Set weight
     * @param weight The weight, in kilograms, of the Animal.
     */
    public void setWeight(int weight){ this.weight = weight;}
}
