import java.util.Scanner;
  
public class Recursive
{

  public static void main(String []args)
  {
    Scanner keyboard = new Scanner(System.in);
    
    double x;
    double err;
    
    System.out.println("Enter a number you want the square root of");
    x = keyboard.nextDouble();
    double guess = x / 2;
    
    System.out.println("Enter an acceptable error");
    err = keyboard.nextDouble();
    
    System.out.println("The square root of " + x + " is " + squareRoot(x , guess, err));
    
  }
  
  public static double squareRoot(double x, double guess, double err)
  {
    double error;
    error = Math.abs(x - guess * guess);
    System.out.println(error + ": error");
    
    if(x <= 0)
    {
      return 1;
    }
    
    if(error <= err)
    {
      return guess;
    }
    
    else
    {
      double newGuess = 0.5 * (guess + x / guess);
      System.out.println(newGuess + ": newGuess");
      return squareRoot(x, newGuess, err);
    }
  }
        
}
 
                
  

