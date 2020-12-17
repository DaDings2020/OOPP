/* 	Program : MyIterator . java
 	Authors : Domenic Heidemann, Philipp Riefer
 	Date 	: 17.12.2020
 */

package buffer;

import java.util.Iterator;

public class MyIterator implements Iterator<Object> {
	
	// attributes
	Buffer buffer;
	int current;
	int size;
	
	
	// constructor
	public MyIterator(Buffer buffer) {
		current=0;
		this.buffer=buffer;
		size=buffer.getSize();
	}

	// methods
	@Override
	public boolean hasNext() {		// looks for any elements left in the array to give out
		
		if (current == size) {
			return false;
		}
		else return true;
	}

	@Override
	public Object next() {			// gives out the element at the position the iterator has reached
		
		Object element = (Object) buffer.get();
		
		current++;
		return element;
	}

}
