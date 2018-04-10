package collections;

import java.util.*;
public class CollectionsTree {

   public static void main(String args[]) {
     // Trees are setreeset that are shown in alpha numeric order
       // Create a tree set
      TreeSet treeset = new TreeSet();
     
      // Add elements to the tree set
      treeset.add("C");
      treeset.add("A");
      treeset.add("B");
      treeset.add("E");
      treeset.add("F");
      treeset.add("D");
      
      // Will print elements in order A-F
      System.out.println(treeset);
   }
}