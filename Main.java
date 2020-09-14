import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input 
    Scanner input = new Scanner (System.in);
    System.out.println ("Please enter in two integers,on seperate lines, to divide.");
    //declare a variable to store first

    int first = input.nextInt ();
    //declare a variable to store second
    int second = input.nextInt ();
    //declare a variable to store result 
  
    int result = (first / second );
    //declare a variable to store remainder
    double remainder = (first % second);
     System.out.println ( first  + " % " + second + " is " + result + " with a remainder of " +  remainder);

    
  }
}
