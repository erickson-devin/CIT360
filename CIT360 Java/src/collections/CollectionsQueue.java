package collections;

import java.util.*;
/* www.codejava.net/java-core/collections/java-queue-collection-tutorial-and-examples */
public class CollectionsQueue {

    public static void main(String[] args) {
            // Queues as they say in the UK are the same as the formation of a line. They help to maintain an order. 
		
            Queue<String> myQueue = new LinkedList<>(Arrays.asList("First", "Second", "Third", "Fourth", "Fifth"));
		
            System.out.println(myQueue);
		
            myQueue.add("Sixth"); // add an item to the end of the list
		
            System.out.println(myQueue);
		
            // This is the next up in the queue
            System.out.println("\nThe next element is: " + myQueue.element()); 
		
            // removes the next element making the second element the next up
            myQueue.remove(); 
		
            System.out.println("\nThe next element is: " + myQueue.element());
		
            System.out.println(myQueue);
		
    }

}