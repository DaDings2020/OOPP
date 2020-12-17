/* 	Program : Buffer . java
 	Authors : Domenic Heidemann, Philipp Riefer
 	Date 	: 11.12.2020
 */

package buffer;

import java.util.Iterator;

public class Buffer implements Iterable<Object> {
	
	
	// attributes
	private int size;		// how many objects are stored currently
	private int first;		// position of first member of waiting queue
	private int last;		// position of last member of waiting queue
	private Object[] elements;		// the array organised as ringbuffer
	private final int minLength = 2;	// the minimal size of the array
	
	
	
	// constructor
	public Buffer() {				// initializes all attributes
		first = 0;
		last = -1;
		size = 0;
		elements = new Object[minLength];
	}
	
	
	
	// methods
	public Object get() {				// get the element that waited the longest time and remove it
		
		if (size==0 & elements.length==2) {		// returns nothing if the buffer is empty
			System.out.println("Fehler: Buffer leer");
			return 0;}
		int tmpFirst=first;
		size--;
		
		if (first+1 > elements.length) {	//sets back first if it reaches the "end" of the array
			first = 0;
		} 
		
		else {
			first++;
		}
		
		Object returnValue = elements[tmpFirst];
		elements[tmpFirst]=null;
		
		resize();
		
		return returnValue;
	}
	
	
	public void put(Object o) {			// add an object to the queue
		
		resize();
		
		size++;
		
		if (last+1 > elements.length) {		//sets last back to the begin if it reached the "end" of the array
			last = 0;
			elements[last] = o;
		} 
		
		else {
			last++;
			elements[last] = o;
		}
	}

	
	public int getSize() {				// how many elements are stored currently
		return size;
	}
	
	
	public int getBuffersize() {		// size of the buffer currently
		return elements.length;
	}
	
	
	public void resize() {				//resizes the buffer according to array-size and number of stored objects
		
		Object[] tmpElements = null;
		if(size==0 & elements.length==minLength) {
			// do nothing if the buffer is empty
		}
		
		else if (size < elements.length*0.25) {		//half size
			
			tmpElements = new Object[(int) (elements.length*0.5)];	//create empty array for copying objects into
			
			for (int i = 0; i < size; i++) {
				tmpElements[i] = elements[(i+first)%elements.length];	//copy objects
			}
			first=0;
			last=size-1;
			elements = new Object[tmpElements.length];					//copy objects back into resized elements-array
			for (int i = 0; i < size; i++) {
				elements[i] = tmpElements[i];
			}
		} 
		
		else if(size == elements.length) {			//double size
			
			tmpElements = new Object[elements.length*2];		//create empty array for copying objects into
			
			for (int i = 0; i < size; i++) {
				tmpElements[i] = elements[(i+first)%elements.length];		//copy objects
			}
			first=0;
			last=size-1;
			elements = new Object[tmpElements.length];				//copy objects back into resized elements-array
			for (int i = 0; i < size; i++) {
				elements[i] = tmpElements[i];
			}
		}
	}
	

	@Override
	public Iterator<Object> iterator() {		// creates a new iterator
		return new MyIterator(this);
	}
	
	
	
	
	
	public static void main(String[] args) {						// testing the buffer by filling it with objects, then getting them back
		Buffer cars = new Buffer();									// while always printing the array's size and the number of elements after each step
		System.out.println("Buffersize = "+ cars.getBuffersize());
		System.out.println("Objects = "+ cars.getSize());
		
		cars.put("Ferrari");
		System.out.println("Buffersize = "+ cars.getBuffersize());
		System.out.println("Objects = "+ cars.getSize());
		
		cars.put("Bugatti");
		System.out.println("Buffersize = "+ cars.getBuffersize());
		System.out.println("Objects = "+ cars.getSize());
		
		cars.put("Lamborghini");
		System.out.println("Buffersize = "+ cars.getBuffersize());
		System.out.println("Objects = "+ cars.getSize());
		
		cars.put("Aston Martin");
		System.out.println("Buffersize = "+ cars.getBuffersize());
		System.out.println("Objects = "+ cars.getSize());
		
		cars.put("Porsche");
		System.out.println("Buffersize = "+ cars.getBuffersize());
		System.out.println("Objects = "+ cars.getSize());
		
		MyIterator iterator = new MyIterator(cars);				//quick iterator to give out the stored cars
				while(iterator.hasNext()) {
				Object element = iterator.next();
					System.out.println(element);
					System.out.println("Buffersize = "+ cars.getBuffersize());
					System.out.println("Objects = "+ cars.getSize());
				}
	
	/*	Old variant without the iterator
	 
		System.out.println("Luxury Car Brand = "+ cars.get());
		System.out.println("Buffersize = "+ cars.getBuffersize());
		System.out.println("Objects = "+ cars.getSize());
		
		System.out.println("Luxury Car Brand = "+ cars.get());
		System.out.println("Buffersize = "+ cars.getBuffersize());
		System.out.println("Objects = "+ cars.getSize());
		
		System.out.println("Luxury Car Brand = "+ cars.get());
		System.out.println("Buffersize = "+ cars.getBuffersize());
		System.out.println("Objects = "+ cars.getSize());
		
		System.out.println("Luxury Car Brand = "+ cars.get());
		System.out.println("Buffersize = "+ cars.getBuffersize());
		System.out.println("Objects = "+ cars.getSize());
		
		System.out.println("Luxury Car Brand = "+ cars.get());
		System.out.println("Buffersize = "+ cars.getBuffersize());
		System.out.println("Objects = "+ cars.getSize());
		*/
	}
}
