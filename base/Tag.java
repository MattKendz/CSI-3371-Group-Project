package base;

import interfaces.BasicIntf;

/*
 * File:	Tag.java
 * Created:	
 * Author:	
 * 
 */

public class Tag implements BasicIntf<Tag>, Comparable<Tag>, java.io.Serializable {


	// *******************************************
	// 1. Attributes
	// *******************************************

	// Key attributes
	protected int theID = 0;

	// Non-key attributes
	// ** there may be some added later **

	// *******************************************
	// 2. Constructors
	// *******************************************

	/**
	 * Default constructor with default attribute values
	 */
	public Tag() {
	}

	/**
	 * Constructor that initializes variables
	 * 
	 * @param aFirstname
	 * @param aLastname
	 */
	
	public Tag(int id) {
		if (isValidID(id)) {
			theID = id;
		} else {
			// Do nothing
		}
	}

	// *******************************************
	// 3. Extractors, i.e., "getters"
	// *******************************************

	/**
	 * Returns the theID
	 * 
	 * @return String
	 */
	public int getID() {
		return theID;
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
		return ("(" + theID +")");
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
		return (theID == 0);
	}

	@Override
	public boolean isComplete() {
		return !isNull();
	}

	private boolean isValidID(int id) {
		boolean result = (id > 0);
		return result;
	}

	// *******************************************
	// 6. Relational operators
	// *******************************************

	@Override
	public boolean isEqual(Tag aTag) {
		return (theID == aTag.theID);
	}

	@Override
	public boolean isLess(Tag aTag) {
		return (theID < aTag.theID);
	}

	@Override
	public boolean isGreater(Tag aTag) {
		return (theID > aTag.theID);
	}

	/**
	 * Compares two Tag objects
	 * 
	 * @param aTag
	 * @return int representing the comparison
	 */
	public int compareTo(Tag aTag) {
		return theID-aTag.theID;

	}
}