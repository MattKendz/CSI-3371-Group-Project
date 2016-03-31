/**
 * File:		BasicIntf.java
 * Create:		2/29/2012
 * Author:		P. Grabow
 * Modified:	3/1/2012
 * By:			P. Grabow
 */
package interfaces;

public interface BasicIntf<T> {

	/**
	 * Is null?
	 * 
	 * @return boolean
	 */
	boolean isNull();

	/**
	 * Is complete?
	 * 
	 * @return boolean
	 */
	boolean isComplete();

	/**
	 * Returns only key fields as a String
	 * 
	 * @return
	 */
	String toString();

	/**
	 * Returns all fields as a String
	 * 
	 * @return
	 */
	String toAllString();

	/**
	 * Is equal to aT?
	 * 
	 * @param aT
	 * @return
	 */
	boolean isEqual(T aT);

	/**
	 * Is less than aT?
	 * 
	 * @param aT
	 * @return
	 */
	boolean isLess(T aT);

	/**
	 * Is greater than aT?
	 * 
	 * @param aT
	 * @return
	 */
	boolean isGreater(T aT);

}