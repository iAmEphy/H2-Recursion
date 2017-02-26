import java.util.Scanner;
  
public class Recursive
{
  public static void main(String []args)
  {
    Scanner keyboard = new Scanner(System.in);
    
    double x;
    double error;
    
    System.out.println("Enter a number that you want the square root of");
    x = keyboard.nextDouble();
    
    double guess = x / 2;
    
    System.out.println("Enter an acceptable error");
    error = keyboard.nextDouble();
    
    System.out.println("The square root of " + x + " is " + squareRoot(x, guess, error));
  }
 
  

  public static double squareRoot(double x, double guess, double error)
  {
    if((x - (guess * guess)) <= error)
    {
      
      return guess;
    }
    else
    {
      guess = 0.5 * (guess + (x / guess));
      return guess;
    }
    
  }
  }
  
  

