package singletonSets;
/**
 * File:	
 * Author:	
 * Created:	
 */
import java.util.Iterator;
import java.util.TreeSet;

import base.Tag;

public class TagSet extends SetGeneric<Tag> implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private static TagSet instance = null;

	private TagSet() {
		this.theSet = new TreeSet<Tag>();
	}
	

	public static TagSet getInstance() {
		if (instance == null) {
			instance = new TagSet();
		}
		return instance;
	}

	@Override
	public boolean insert(Tag aTag) {
		if( aTag.isComplete()) {
			return theSet.add(aTag);
		} else
		return false;
	}

	public Tag get(int id) {
		Tag searchTag = new Tag(id);
		Iterator<Tag> it = theSet.iterator();
		Tag foundTag = new Tag();
		while( it.hasNext()) {
			foundTag = it.next();
			if( foundTag.isEqual(searchTag)) {
				return foundTag;
			}
		}
		return new Tag();  // nothing found
	}

}