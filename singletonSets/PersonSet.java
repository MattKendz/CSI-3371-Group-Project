package singletonSets;
/**
 * File:	PersonSet.java
 * Author:	P. Grabow
 * Created:	11/10/15
 */
import java.util.Iterator;
import java.util.TreeSet;

import base.Person;

public class PersonSet extends SetGeneric<Person> implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private static PersonSet instance = null;

	private PersonSet() {
		this.theSet = new TreeSet<Person>();
	}

	public static PersonSet getInstance() {
		if (instance == null) {
			instance = new PersonSet();
		}
		return instance;
	}

	@Override
	public boolean insert(Person aPerson) {
		if( aPerson.isComplete()) {
			return theSet.add(aPerson);
		} else
		return false;
	}

	public Person get(String aFirstname, String aLastname) {
		Person searchPerson = new Person(aFirstname, aLastname);
		Iterator<Person> it = theSet.iterator();
		Person foundPerson = new Person();
		while( it.hasNext()) {
			foundPerson = it.next();
			if( foundPerson.isEqual(searchPerson)) {
				return foundPerson;
			}
		}
		return new Person();  // nothing found
	}

}