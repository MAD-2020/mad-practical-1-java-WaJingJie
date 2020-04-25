import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner userinput = new Scanner(System.in);
    List<Integer> numlist = new ArrayList<Integer>();
    System.out.println("Enter a number: ");
    int number = Integer.parseInt(userinput.nextLine());

    for(int i = 0; i< number; ++i){
      System.out.println("Enter a number: ");
      int numbers = Integer.parseInt(userinput.nextLine());
      numlist.add(numbers);
    }

    Integer[] numarray = new Integer[numlist.size()]; 

    numarray = numlist.toArray(numarray);

    int element = 0;
    int count = 0;
    for(int i=0;i<numarray.length;i++){
      int tempElement = numarray[i];
      int tempCount = 0;
      for(int p=0;p<numarray.length;p++){
        if(numarray[p]==tempElement){
          tempCount++;
        }
      }
      if(tempCount>count){
        element = tempElement;
        count = tempCount;
      }
    }

    System.out.println("The most frequent number is " + element);
  }
}
