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
    double[] testScores = new double[teststoCompare];

     // main code

    newLine();

    System.out.println("Welcome to the 5TestAverager!");
    newLine();

    sleep(1500);

    System.out.println("In this machine, it will get the average of 5 of your grades (can be doubles), then give you whenever you passed the lowest overall grade!");
    newLine();

    sleep(3000);

    System.out.println("Have Fun!");
    sleep(3000);

    for (int i = 0; i < testScores.length; i++) {
      newLine();
      System.out.println("What is your score for assignment " + (i + 1) + "?");
      testScores[i] = scan.nextDouble();
    }

    newLine();
    System.out.println("Here are your scores:");

    sleep(1500);

    for (int i = 0; i < testScores.length; i++) {
      System.out.println((i + 1) + " " + testScores[i]);
    } 
    
    sleep(3000);

    System.out.println("Getting your average...");


  }

  static void sleep(int milli) {
      try {
        Thread.sleep(milli);
      }
      catch(Exception e) {
        Thread.interrupted();
      }
  }

  static void newLine() {
    System.out.print("\n");
  }
}

 // avg test score class
class gettestscoreAvg {
   // avg test score method (Returns a double based on the average from your 5 test scores)
  public double getAvg(int[] testscoreArray) {

    return 2.2;
  }
}

 // if passed class
class gettestscoreAvg {
   // if passed class method (Returns a boolean based on the average from your 5 test scores)
  public double getAvg(int[] testscoreArray) {

    return 2.2;
  }
}