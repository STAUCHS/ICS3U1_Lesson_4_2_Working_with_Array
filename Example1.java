import java.util.Arrays;

public class Example1 extends ConsoleProgram {

  public void run() {
      
    // Initialize arrays
    int[] temperatures1 = {5, -1, -3, 4, 2};
    int[] temperatures2 = {7, 6, 5, 8, 7};

    // Reassign temperatures2 to temperatures1
    temperatures2 = temperatures1;
    System.out.println(temperatures1[1]);
    System.out.println(temperatures2[1]);

    // Updating an element value
    temperatures1[1] = 10;
    System.out.println(temperatures1[1]);
    System.out.println(temperatures2[1]);
    
    // Print out the temperatures1 array
    System.out.println(temperatures1);
  }
}