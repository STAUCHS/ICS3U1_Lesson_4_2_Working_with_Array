public class Example2 extends ConsoleProgram {

  public void run() {
    
    int[] marks = new int[5];
    int total;
    double average;
    int searchMark;
    boolean markfound = false;
    
    // read in the values
    for (int index = 0; index < 5; index++){
      marks[index] = readInt("Enter a mark: ");
     }

    System.out.println("\nThere " + marks.length + " elements in the array.\n");

    // output the marks
    for(int index = 0; index < marks.length; index++){
      System.out.println("mark " + (index+1) + ": " + marks[index]);
    }

    // apply a 2 mark boost
    for (int index = 0; index < marks.length; index++){
      marks[index] = marks[index] + 2;
    }

    System.out.println("");
    System.out.println("*** Marks with 2+ boost ***");

    // output the marks with the boost
    for(int index = 0; index < marks.length; index++){
      System.out.println("mark " + (index+1) + ": " + marks[index]);
    }

    // compute the average using the total marks
    total= 0;
    for(int index = 0; index < marks.length; index++){
        total = total + marks[index];
    }
    
    average = (double)total/marks.length;
    System.out.println("\nThe average of the class is " + average);  
    
    // search the array for mark
    searchMark = readInt("Enter the mark to search: ");

    for (int i = 0; i < marks.length; i++){
      if(marks[i] == searchMark){  //check the mark in the current position
        System.out.println(searchMark + " found in position " + i);
        markfound = true;
        break;
      }
    }

    if (!markfound){
      System.out.println("Mark not found");
    }

  }
}