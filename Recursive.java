import java.util.Scanner;
  
public class Recursive
{
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
    
    
    double newGuess = squareRoot(x, initialGuess, error);
    
    System.out.println(squareRoot(x, newGuess));
    
  }
  
  public static double squareRoot(double x, double initialGuess, double error)
  {
    double newGuess;
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
  
  public static double squareRoot(double x, double newGuess)
  {
   double difference = Double.MAX_VALUE;
   newGuess = x / 2;
    double lastGuess = newGuess;
    
    
    while(Math.abs(difference) >= 0.01)
    {
      double a = x / newGuess;
      newGuess = (newGuess + a) / 2;
      difference = ((newGuess - lastGuess) / lastGuess);
      lastGuess = newGuess;
      
    }
    return newGuess;
  }
 
}
  

