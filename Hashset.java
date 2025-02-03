import java.util.HashSet;

public class Hashset {
  public static void main(String[] args) {
    HashSet<String> fruits = new HashSet<>(); // hashset syntax

    // Add elements
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Mango");
    fruits.add("Orange");

    boolean isAdded = fruits.add("Apple");
    System.out.println("Was the element 'Apple' added again? " + isAdded);

    // Display the elements
    System.out.println("HashSet elements: " + fruits);

    // Check if an element is present in the HashSet
    boolean containsBanana = fruits.contains("Banana");
    System.out.println("Does the HashSet contain 'Banana'? " + containsBanana);

    // Remove an element from the HashSet
    fruits.remove("Mango");
    System.out.println("HashSet elements after removing 'Mango': " + fruits);

    // Iterate through the HashSet
    System.out.print("Iterating through HashSet: ");
    for (String fruit : fruits) {
      System.out.print(fruit + " ");
    }
  }
}