 // LESSON 4 - PART 2
import java.util.ArrayList;
 
public class ArrayListDemo {
    public static void main(String[] args) {
 
        // STEP 1: Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>(); //dynamic array
 
        // STEP 2: Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Blueberries");
 
        // STEP 3: Print all elements
       for(String i : fruits){
        System.out.println(i);
       }
 
        // STEP 4: Remove an element
        //Remove banana
       fruits.remove(1);
       for(String i : fruits){
        System.out.println(i);
       }
 
        // STEP 5: Access element by index
       System.out.println("\nFirst fruit: " + fruits.get(0));
 
        // STEP 6: Check if a fruit exists
        if(fruits.contains("Cherry")){
            System.out.println("Cherry is in the list");
        }
        
} 
}