 // imports
import java.util.Scanner;

 // main class
class Main {
   // main method
  public static void main(String[] args) {

     // objects
    Scanner scan = new Scanner(System.in);
    gettestscoreAvg scoreAvg = new gettestscoreAvg();
    passedScore scorePassed = new passedScore();

     // variables
    int scorestoCompare = 5;
    double lowestpassingGrade = 70;
    double[] testScores = new double[scorestoCompare];

     // main code
 
     // introduction
    newLine();

    System.out.println("Welcome to the 5TestAverager!");
    newLine();

    sleep(1500);

    System.out.println("In this machine, it will get the average of 5 of your grades (can be doubles), then give you whenever you passed the lowest overall grade!");
    newLine();

    sleep(3000);

    System.out.println("Have Fun!");
    sleep(3000);

     // for loop which will gather the values you input through the scanner
    for (int i = 0; i < testScores.length; i++) {
      newLine();
      System.out.println("What is your score for assignment " + (i + 1) + "?");
      testScores[i] = scan.nextDouble();
    }

    newLine();
    System.out.println("Here are your scores:");

    sleep(1500);

     // for loop which will print out the values you inputed
    for (int i = 0; i < testScores.length; i++) {
      System.out.println((i + 1) + " " + testScores[i] + "%");
    } 
    
    newLine();

    sleep(3000);

    System.out.println("Getting your average...");
    newLine();

     // uses the gettestscoreAvg method which was called to get your average
    double finalAverage = scoreAvg.getAvg(testScores, scorestoCompare);

    sleep(1500);

    System.out.println("Your average from your 5 scores: " + finalAverage + "%");
    System.out.println("Estimated average: " + ((int)(finalAverage + 0.5)) + "%");

    newLine();

    sleep(1500);

    System.out.println("Checking if you passed...");
    newLine();

     // uses the passedScore method which was called to get your passing results
    boolean[] finalPassed = scorePassed.getBooleans(testScores, finalAverage, lowestpassingGrade);

    sleep(1500);


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
  public double getAvg(double[] testscoreArray, int scorestoCompare) {
    double avgResult = 0;

    for (int i = 0; i < testscoreArray.length; i++) {
      avgResult += testscoreArray[i];
    } 
    
    avgResult = avgResult/scorestoCompare;

    // return the average
    return avgResult;
  }
}

 // calculate passing result class
class passedScore {
   // calculate passing result method (Returns a boolean based on the average from your 5 test scores)
  public boolean[][] getBooleans(double[] testscoreArray, double average, double lowestGrade) {
    boolean[] returnarrayResult = {};
    boolean returnavgResult;
    

    for (int i = 0; i < testscoreArray.length; i++) {
      if (testscoreArray[i] < lowestGrade) {
        returnarrayResult[i] = false;
      }
      else {
        returnarrayResult[i] = true;
      }
    } 

    if (average < lowestGrade) {
      returnavgResult = false;
    }
    else {
      returnavgResult = true;
    }

    boolean[][] finalbooleanResults = {returnarrayResult, {returnavgResult}};

     // return the passing result
    return finalbooleanResults;
  }
}