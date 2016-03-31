/**
 * File:     SetGeneric.java
 * Created:  3/2/2008
 * Author:   P. Grabow
 * Modified: 2/4/2009
 * By:       P. Grabow
 */

package singletonSets;

import java.util.*;

public abstract class SetGeneric<T> implements java.io.Serializable  {

	private static final long serialVersionUID = 1L;
	
	protected SortedSet<T> theSet;

	/**
	 * Remove all elements from set
	 */
	public void clear() {
		theSet.clear();
	}

	/**
	 * Insert object into set
	 * 
	 * @param anObject
	 * @return whether object was inserted
	 */
	public abstract boolean insert(T anObject);

	/**
	 * Is set empty?
	 * 
	 * @return whether set is empty
	 */
	public boolean isEmpty() {
		return theSet.isEmpty();
	}

	/**
	 * Is object in set?
	 * 
	 * @param anObject
	 * @return whether object in set
	 */
	public boolean isIn(T anObject) {
		return theSet.contains(anObject);
	}

	/**
	 * Returns iterator for collection
	 * 
	 * @return Iterator for set
	 */
	public Iterator<T> iterator() {
		return theSet.iterator();
	}

	/**
	 * Removes object from set
	 * 
	 * @param anObject
	 * @return whether removal occurred
	 */
	public boolean remove(T anObject) {
		return theSet.remove(anObject);
	}

	/**
	 * Returns size of set
	 * 
	 * @return size of set
	 */
	public int size() {
		return theSet.size();
	}

	/**
	 * Returns String equivalent of set
	 * 
	 * @return String equivalent of set
	 */
	public String toString() {
		return theSet.toString();
	}
}