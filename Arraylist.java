import java.util.ArrayList;

public class Arraylist {
  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<>(); // sysntax

    // Add elements
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);

    System.out.println("Element at index 0: " + numbers.get(0)); // access elements
    System.out.println("Element at index 2: " + numbers.get(2));

    numbers.remove(1);

    System.out.println("ArrayList elements: " + numbers); // render the elements

    // Iterate through the ArrayList
    System.out.print("Iterating through ArrayList: ");
    for (int number : numbers) {
      System.out.print(number + " ");
    }
  }
}
