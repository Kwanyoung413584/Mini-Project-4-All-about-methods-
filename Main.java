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
    int scorestoCompare = 0;
    double lowestpassingGrade = 70;
    double[] testScores;

     // main code
 
     // introduction
    newLine();

    System.out.println("Welcome to the TestAverager Program!");
    newLine();

    sleep(1500);

    System.out.println("In this program, it will get the average of your grades (can be doubles), then give you whenever you passed the lowest overall grade!");
    newLine();

    sleep(3000);

     // scanner which will pick up a int from the user
    System.out.println("How much grades do you want the program to calculate? (int)");
    scorestoCompare = scan.nextInt();

    newLine();

    System.out.println("Great! This program will look for " + scorestoCompare + " grades and then print their results!");

    // create a array for "testScores"
    testScores = new double[scorestoCompare];

    newLine();

    sleep(3000);


    System.out.println("Have Fun!");
    sleep(3000);

     // for loop which will gather the values you input through the scanner
    for (int i = 0; i < testScores.length; i++) {
      newLine();
      System.out.println("What is your grade for assignment " + (i + 1) + "? (" + (i + 1) + " / " + scorestoCompare + ")");
      testScores[i] = scan.nextDouble();
    }

    newLine();
    System.out.println("Here are your grades:");

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

    System.out.println("Your average from your " + scorestoCompare + " grades: " + finalAverage + "%");
    System.out.println("Estimated average: " + ((int)(finalAverage + 0.5)) + "%");

    newLine();

    sleep(1500);

    System.out.println("Checking if you passed...");
    newLine();

     // uses the passedScore method which was called to get your passing results
    boolean[][] finalPassed = scorePassed.getBooleans(testScores, finalAverage, lowestpassingGrade, scorestoCompare);

    boolean[] finalpassedArray = new boolean[scorestoCompare];
    boolean finalpassedAvg;

    for (int i = 0; i < testScores.length; i++) {
      finalpassedArray[i] = finalPassed[0][i];
    }

    finalpassedAvg = finalPassed[1][0];


    sleep(3000);

    System.out.println("Here are your pass status for each assignment:");

    newLine();

    sleep(1500);

    for (int i = 0; i < testScores.length; i++) {
      System.out.println(testScores[i] + "% : " + finalpassedArray[i]);
    }

    sleep(1500);

    newLine();

    System.out.println("Here is whenever you passed your average:");

    newLine();

    sleep(1500);

    System.out.println(finalAverage + "% : " + finalpassedAvg);

    newLine();

    sleep(3000);

    System.out.println("Thank you for using this program :)");

  }

   // usless main methods
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

// important methods

 // avg test score class
class gettestscoreAvg {
   // avg test score method (Returns a double based on the average from your choosen test scores)
  public double getAvg(double[] testscoreArray, int getscorestoCompare) {
    double avgResult = 0;

    for (int i = 0; i < testscoreArray.length; i++) {
      avgResult += testscoreArray[i];
    } 
    
    avgResult = avgResult/getscorestoCompare;

    // return the average
    return avgResult;
  }
}

 // calculate passing result class
class passedScore {
   // calculate passing result method (Returns a boolean based on the average from your choosen test scores)
  public boolean[][] getBooleans(double[] testscoreArray, double average, double lowestGrade, int getscorestoCompare) {
    boolean[] returnarrayResult = new boolean[getscorestoCompare];
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