public class Example1 extends ConsoleProgram {

  public void run() {
    
    int[] temperatures1 = {5, -1, -3, 4, 2};
    int[] temperatures2 = {7, 6, 5, 8, 7};

    temperatures2 = temperatures1;
    System.out.println(temperatures1[1]);
    System.out.println(temperatures2[1]);
  }
}