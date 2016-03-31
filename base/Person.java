package base;

import interfaces.BasicIntf;

/*
 * File:	Person.java
 * Created:	11/1/2015
 * Author:	P. Grabow
 * 
 */

public class Person implements BasicIntf<Person>, Comparable<Person>, java.io.Serializable {

	private final String NULL_NAME = null;
	private final int MAX_NAME_LENGTH = 40;
	private final int MIN_NAME_LENGTH = 1;

	// *******************************************
	// 1. Attributes
	// *******************************************

	// Key attributes
	protected String theFirstName = NULL_NAME;
	protected String theLastName = NULL_NAME;

	// Non-key attributes
	// ** there may be some added later **

	// *******************************************
	// 2. Constructors
	// *******************************************

	/**
	 * Default constructor with default attribute values
	 */
	public Person() {
	}

	/**
	 * Constructor that initializes variables
	 * 
	 * @param aFirstname
	 * @param aLastname
	 */
	public Person(String aFirstname, String aLastname) {
		if (isValidName(aFirstname) && isValidName(aLastname)) {
			theFirstName = aFirstname.trim();
			theLastName = aLastname.trim();
		} else {
			// Do nothing
		}
	}

	// *******************************************
	// 3. Extractors, i.e., "getters"
	// *******************************************

	/**
	 * Returns the theFirstName
	 * 
	 * @return String
	 */
	public String getFirstname() {
		return theFirstName;
	}

	/**
	 * Returns the theLastName
	 * 
	 * @return String
	 */
	public String getLastname() {
		return theLastName;
	}

	// *******************************************
	// 4. Modifiers, i.e., "setters"
	// *******************************************

	// Note: Neither of the attributes should be
	// modified once the object has been created

	// *******************************************
	// 5. Utilities
	// *******************************************

	/**
	 * Returns key attributes
	 * 
	 * @return: the string
	 */
	public String toString() {
		return ("(" + theLastName + ", " + theFirstName +")");
	}

	/**
	 * Returns all attributes
	 * 
	 * @return: the string
	 */
	public String toAllString() {
		return toString();
	}

	@Override
	public boolean isNull() {
		boolean result = ((theFirstName == NULL_NAME) && (theLastName == NULL_NAME));
		return result;
	}

	@Override
	public boolean isComplete() {
		return !isNull();
	}

	private boolean isValidName(String aName) {
		int length = aName.trim().length();
		boolean result = (length >= MIN_NAME_LENGTH)
				&& (length <= MAX_NAME_LENGTH);
		return result;
	}

	// *******************************************
	// 6. Relational operators
	// *******************************************

	@Override
	public boolean isEqual(Person aPerson) {
		return (compareTo(aPerson) == 0);
	}

	@Override
	public boolean isLess(Person aPerson) {
		return (compareTo(aPerson) < 0);
	}

	@Override
	public boolean isGreater(Person aPerson) {
		return (compareTo(aPerson) > 0);
	}

	/**
	 * Compares to Person objects
	 * 
	 * @param aPerson
	 * @return int representing the comparison
	 */
	public int compareTo(Person aPerson) {
		int lastCmp = theLastName.compareToIgnoreCase(aPerson.theLastName);

		if (lastCmp == 0) {
			return theFirstName.compareToIgnoreCase(aPerson.theFirstName);
		} else {
			return lastCmp;
		}
	}
}