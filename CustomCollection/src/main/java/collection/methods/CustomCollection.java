package collection.methods;

import java.util.Arrays;

/*
 * @author Bhargav reddy id:170030703
 */

public class CustomCollection<E> {
	static final org.apache.log4j.Logger Logger =org.apache.log4j.Logger.getLogger("CustomCollection.class");

	private int size = 0;
    
   
    private static final int Intial_capacity = 10;  //intial capacity
     
    
    private Object elements[];
 
    
    public CustomCollection() {
        elements = new Object[Intial_capacity];
    }
 
  
    public void addele(E e) {    //e is argument and E type of object
    	Logger.info("add element Method");
        if (size == elements.length) {
            increaseCapacity();
        }
        elements[size++] = e;
    }
     
    
   
    public E getvalue(int i) {
    	Logger.info("getvalue Method");
        if (i >= size || i < 0) {
        	Logger.error("i is greater than given length (or) i is less than 0 ");
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];   //type conversion Object to E
    }
     
    
   
    public E remove(int i) { //remove method internally checks equals() and hashcode()
    	Logger.info("Remove Method");
        if (i >= size || i < 0) {
        	Logger.error("i is greater than given length (or) i is less than 0 ");

            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        Object item = elements[i];
        int numElts = elements.length - ( i + 1 ) ;
        System.arraycopy( elements, i + 1, elements, i, numElts ) ; //(sourcearray,sourcepos,destinationarray,destinationpos,len)
        size--;
        return (E) item;
    }
     
    
    public int size() {    //returns no of of elements(size) 
        return size;
    }
     
   
    
    public String toString()       //This Method Calls when Object is passed as argument to System.out.println
    {
         StringBuilder strbui = new StringBuilder();
         strbui.append('[');
         for(int i = 0; i < size ;i++) {
             strbui.append(elements[i].toString());  //type conversion object to string
             if(i<size-1){
                 strbui.append(",");
             }
         }
         strbui.append(']');
         return strbui.toString();
    }
     
    private void increaseCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize); //takes original array and increase size of array by padding zeros
    }
}
