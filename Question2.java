import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner userinput = new Scanner(System.in);
    double height = Double.parseDouble(userinput.nextLine());
    
    System.out.println("Enter weight: ");
    double weight = Double.parseDouble(userinput.nextLine());
    
    double bmi = weight / (height * height);

    System.out.println(bmi);
  }
}
