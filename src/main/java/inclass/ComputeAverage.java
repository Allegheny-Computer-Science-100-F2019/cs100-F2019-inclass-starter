package inclass;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * This class has a method that accepts user input and displays it as output.
 * The program will make a prompt, accept input and then make another prompt
 * and accept input another time. This program can calculate an average.
 *
 * <p>Bugs: This program has no known bugs.
 *
 * @author Lewis and Loftus
 */
public class ComputeAverage {

  /**
   * Demonstrate the use of the Scanner class to read user input.
   * Read the documentation in the README to learn about this program.
   * From your "home base", you can run this program with:
   * gradle -q --console plain runComputeAverage
   */
  public static void main(String[] args) {
    // TODO: describe the declarations
    int sum = 0;
    int value;
    int count = 0;
    double average;

    // TODO: describe
    Scanner scan = new Scanner(System.in);

    // TODO: describe
    System.out.print("Enter an integer (0 to quit): ");
    value = scan.nextInt();

    // TODO: describe
    while (value != 0) {
      count++;
      sum += value;
      System.out.println("The sum so far is " + sum);
      System.out.print("Enter an integer (0 to quit): ");
      value = scan.nextInt();
    }

    // TODO: describe
    System.out.println();

    // TODO: describe
    if (count == 0) {
      System.out.println("No values were entered.");
    } else {
      // TODO: describe
      average = (double)sum / count;
      DecimalFormat fmt = new DecimalFormat("0.###");
      // add the code to print the line with the fmt object
      System.out.println("The average is " + fmt.format(average));
    }
  }
}
