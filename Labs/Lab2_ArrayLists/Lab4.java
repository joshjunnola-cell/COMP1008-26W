import java.util.ArrayList;
import java.util.Arrays;
 
public class Lab4 {
    public static void main(String[] args) {
 
        // Lab 4 – COMP1008 Programming Fundamentals
        // Topic: Arrays & ArrayLists
 
        // ================================================
        // STEP 1: Create an array of grocery items (String)

        // Add at least 6 items to the array
        // Example: {"Milk", "Eggs", "Bread", ... }
        

        // ================================================
        String[] groceries = new String[]{
            "Milk","Eggs","Bread","Cereal","Apple","Butter"
        };
 
        // ================================================
        // STEP 2: Print the array using Arrays.toString()
        // ================================================
       System.out.println(Arrays.toString(groceries));
 
 
        // ================================================
        // STEP 3: Transfer all array items into an ArrayList
        // Use a loop to add each item
        // ================================================
        ArrayList<String> groceryList = new ArrayList<>();
        
        // TODO: Loop through the array and add items to groceryList
        for(String item : groceries){
            groceryList.add(item);
        }
        
        System.out.println(groceryList);
 
        // ================================================
        // STEP 4: Modify the ArrayList
        // Add two new items
        // Remove one item by name or index
        // Print the updated ArrayList
        // ================================================
        
        groceryList.add("Noodles");
        groceryList.add("Garlic");
        groceryList.remove(2);
        
        System.out.println("=============");

        System.out.println(groceryList);
 
        // ================================================
        // STEP 5: Count how many items start with a vowel
        // Hint: vowels = a, e, i, o, u
        // Use .toLowerCase(). startsWith()
        // ================================================
        String vowels[] = {"a", "e", "i", "o", "u"};
        int vowelCount = 0;

        for(String item : groceryList){
            for(String vowel : vowels){
                if(item.toLowerCase().startsWith(vowel)){
                    vowelCount++;
                    break;
                }
            }
        }
 
        // ================================================
        // STEP 6: Print the final results
        // ================================================
        System.out.println(vowelCount + " words start with a vowel.");
 
    }
}