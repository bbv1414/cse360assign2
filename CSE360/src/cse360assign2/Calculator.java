/** 
* The Calculator class contains methods of different calculator
* functions. It can add, subtract, multiply, divide, and list
* the number history.
* 
* @author Bradley Villegas Class ID: 576
*/

package cse360assign2;

public class Calculator {

	private int total;

	/**
	 * Creates a calculator
	 */
	public Calculator() {
		total = 0; // not needed - included for clarity
	}

	/**
	 * Returns the total
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * Adds a number to the total
	 * 
	 * @param value
	 * 			the integer to be added to the total
	 */
	public void add(int value) {
		total = total + value;
	}

	/**
	 * Subtracts a number from the total
	 * 
	 * @param value
	 * 			the integer to be subtracted from the total
	 */
	public void subtract(int value) {
		total = total - value;
	}

	/**
	 * Multiplies a number by the total
	 * 
	 * @param value
	 * 			the integer to be multiplied by the total
	 */
	public void multiply(int value) {
		total = total * value;
	}

	/**
	 * Divides the total by the number
	 * 
	 * @param value
	 * 			the integer to divide into the total
	 */
	public void divide(int value) {
		total = total / value;
	}

	/**
	 * Returns the history of the calculations
	 */
	public String getHistory() {
		return "";
	}
}