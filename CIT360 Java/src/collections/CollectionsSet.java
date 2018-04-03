package collections;

import java.util.*;

public class CollectionsSet {

  public static void main(String args[]) { 
     int count[] = {5,23,15,42,64,15};
     Set<Integer> set = new HashSet<Integer>();
     try{
        for(int i = 0; i<5; i++){
           set.add(count[i]);
        }
        System.out.println(set);
  
        TreeSet<Integer> sortedSet = new TreeSet<Integer>(set);
        // Dispaly an sorted list
        System.out.println("Sorted list is:"+" "+ sortedSet);
      
        // Display a number from a sorted list
        System.out.println("The First number is : "+
                          (Integer)sortedSet.first());
        
        
        System.out.println("The last last number is: "+
                        (Integer)sortedSet.last());
     }
     catch(Exception e){}
  }
}