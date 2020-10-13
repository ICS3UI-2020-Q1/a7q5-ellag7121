import java.util.Scanner;
/**
 * create a method that, whan given an intger, returns the first digit of that intger
 * @author Graham Ellacott
 */
public class Main {

  //the method that finds the first digit in the number and returns it
  public static int firstDigit(int number){
    //repeat this until the number is only 1 digit (less than 10)
    while(number >= 10){
      number /= 10; //divide by 10 (this removes the digit in the 1's column of the number given)
    }
    //once the number is less than 10, the only digit left should be the first digit
    return number;
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //make a Scanner
    Scanner input = new Scanner(System.in);

    // test the method
    while(true){ //repeat the test code so you can provide as many test numbers as you want
      System.out.println("Provide a number to find the first digit of");
      int number = input.nextInt(); //store the number is the variable
      number = firstDigit(number); //use the method on the given number and store it in the variable
      System.out.println(number); //tell the user the first digit
    }
    

    
  }
}
