package inclass;

/**
 * This class has a method that shows array declaration and use.
 *
 * <p>Bugs: This program has no known bugs.
 *
 * @author Lewis and Loftus
 * @author Add Your Name Here
 */

public class BasicArrayComputations {

  /** Declare variables that control array printing. */
  private static final int LIMIT = 15;
  private static final int MULTIPLE = 10;

  /**
   * Demonstrate the use of the array container and the use of loops.
   * Read the documentation in the README to learn about this program.
   * From your "home base", you can run this program with:
   * gradle runBasicArrayComputations
   */
  public static void main(String[] args) {
    // declare and allocate space for the array
    int[] list = new int[LIMIT];

    //  Initialize the array values
    for (int index = 0; index < LIMIT; index++) {
      list[index] = index * MULTIPLE;
    }

    // change one array value
    list[5] = 999;

    //  print the array values
    for (int value : list) {
      System.out.print(value + "  ");
    }

    // print out an extra newline
    System.out.println();

  }

}

// This is the output from running this program:
//
// TODO: Give the output from running this program on this line

// What is the purpose of the LIMIT variable?
//
// TODO: Write at least two lines to answer this question.

// What is the purpose of the MULTIPLE variable?
//
// TODO: Write at least two lines to answer this question.
