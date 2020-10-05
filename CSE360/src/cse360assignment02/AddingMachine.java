package cse360assignment02;

/**
 * The AddingMachine program implements a class that can perform
 * addition and subtraction operations on a total.
 * @author Anthony Mac
 * @version 1.0
 */
public class AddingMachine {
  /**
 * The total variable stores the combined result of all transactions.
 */
private int total;
  
  /**
 * Constructor.
 */
public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  /**
 * Accessor method for the total variable. 
 * @return int
 */
public int getTotal () {
    return 0;
  }
  
  /**
 * This method adds the input to the total.
 * @param value This is the value added to the total.
 */
public void add (int value) {
  }

  /**
 * This method subtracts the input from the total.
 * @param value This is the value subtracted from the total.
 */
public void subtract (int value) {
  }

  /**
 * This method returns a string representation of all transactions.
 */
public String toString () {
    return "";
  }

  /**
 * This method clears the transactions and resets the total.
 */
public void clear() {
  }
}