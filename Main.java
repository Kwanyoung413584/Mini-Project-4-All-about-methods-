 // imports
import java.util.Scanner;

 // main class
class Main {
   // main method
  public static void main(String[] args) {

     // objects
    Scanner scan = new Scanner(System.in);
    gettestscoreAvg testAvg = new gettestscoreAvg();

     // variables
    int teststoCompare = 5;
    int testScores = new testScores[teststoCompare]

     // main code
    System.out.print("\n");
    System.out.println("Welcome to the 5TestAverager!");
    sleep(1500);
    System.out.println("In this machine, it will get the average of 5 of your grades, then give you whenever you passed the lowest overall grade!");
    sleep(500);
    System.out.println("Have Fun!");


  }

  static void sleep(int milli) {
      try {
        Thread.sleep(milli);
      }
      catch(Exception e) {
        Thread.interrupted();
      }
  }
}

 // avg test score class
class gettestscoreAvg {
   // avg test score method (Returns a double based on the average from your 5 test scores)
  public double getAvg(int Test1, int Test2, int Test3, int Test4, int Test5) {

    return 2.2;
  }
}