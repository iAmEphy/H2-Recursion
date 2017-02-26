import java.util.Scanner;
  
public class Recursive
{
  static int count = 0;
  public static void main(String []args)
  {
    Scanner keyboard = new Scanner(System.in);
    
    double x;
   
    double error;
    
    
    System.out.println("Enter a number you want the square root of");
    x = keyboard.nextDouble();
    double initialGuess = x / 2;
    
    System.out.println("Enter an acceptable error");
    error = keyboard.nextDouble();
    
    
    System.out.println(squareRoot(x, initialGuess, error));
    
  }
  
  public static double squareRoot(double x, double initialGuess, double error)
  {
    count++;
    
   
    if(Math.abs(initialGuess * initialGuess - x) <= error)
    {
      return initialGuess;
    }
    else 
    {
      initialGuess = 0.5 * (initialGuess + (x / initialGuess));
      return initialGuess;
    }
   
   }
    
    
  
  
 
}
  

