public class Example2 extends ConsoleProgram {

  public void run() {
    
    int[] marks = new int[5];
    int total;
    double average;
    int searchMark;
    boolean markFound = false;
    
    // Assign values to each element through user input
    for (int index = 0; index < 5; index++) {
      marks[index] = readInt("Enter a mark: ");
    }

    // Output number of elements in the array
    System.out.println("\nThere are " + marks.length + " elements in the array.\n");

    // Output the marks
    for (int index = 0; index < marks.length; index++) {
      System.out.println("Mark " + (index+1) + ": " + marks[index]);
    }

    // Apply a mark boost - increase each mark by 2
    for (int index = 0; index < marks.length; index++) {
      marks[index] = marks[index] + 2;
    }

    System.out.println("");
    System.out.println("*** Marks with 2+ boost ***");

    // Output the marks with the boost
    for (int index = 0; index < marks.length; index++) {
      System.out.println("Mark " + (index+1) + ": " + marks[index]);
    }

    // Compute the average using the total marks
    total = 0;
    for (int index = 0; index < marks.length; index++) {
        total = total + marks[index];
    }
    
    average = (double)total/marks.length;
    System.out.println("\nThe average of the class is " + average);  

    // Search the array for mark
    searchMark = readInt("Enter the mark to search: ");

    for (int i = 0; i < marks.length; i++) {
      if (marks[i] == searchMark) {  // check the mark in the current position
        System.out.println(searchMark + " found in position " + i);
        markFound = true;
        break;
      }
    }

    // Checks if mark is not found
    if (!markFound) {
      System.out.println("Mark not found.");
    } 

  }
}