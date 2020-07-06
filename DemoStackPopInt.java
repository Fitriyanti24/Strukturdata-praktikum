import java.util.*;
public class DemoStackPopInt {
 public static void main(String[] args) {
 // Creating an empty Stack
 Stack<Integer> STACK = new Stack<Integer>();

 STACK.push(10);
 STACK.push(15);
 STACK.push(30);
 STACK.push(20);
 STACK.push(5);

 // Displaying the Stack
 System.out.println("Initial Stack: " + STACK);

 // Removing elements using pop() method
 System.out.println("Pop elemen: " +
 STACK.pop());
 System.out.println("Pop elemen: " +
 STACK.pop());

 // Displaying the Stack after pop operation
 System.out.println("Update Stack "
 + STACK);
 }

}