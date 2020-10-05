package cse360assignment02;

/**
 * The AddingMachine program implements a class that can perform
 * addition and subtraction operations on a total, and saves
 * a record of all transactions in the history.
 * @author Anthony Mac
 * @version 2.0
 */
public class AddingMachine {
  /**
 * The total variable stores the combined result of all transactions.
 */
private int total;
 /**
* The history variable records all transactions.
*/
private String history;
  /**
 * Constructor. Initializes total as 0 and history as "0".
 */
public AddingMachine () {
    clear();
  }
  
  /**
 * Accessor method for the total variable. 
 * @return int
 */
public int getTotal () {
    return total;
  }
  
  /**
 * This method adds the input to the total, and updates the history.
 * @param value This is the value added to the total.
 */
public void add (int value) {
	total += value;
	history += " + " + value;
  }

  /**
 * This method subtracts the input from the total, and updates the history.
 * @param value This is the value subtracted from the total.
 */
public void subtract (int value) {
	total -= value;
	history += " - " + value;
  }

  /**
 * This method returns a string representation of all transactions,
 * which is the history.
 */
public String toString () {
    return history;
  }

  /**
 * This method clears the transactions and resets the total.
 */
public void clear() {
	total = 0;
	history = "0";
  }
}