import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class MainQuizzer {
	public static ArrayList <Integer> myArray = new ArrayList<Integer>();
	static boolean notNegative = true;
	static Scanner userInput = new Scanner (System.in);
	public static void main(String[] args)
		{
		derp();
		}
	public static void derp()
	{
		System.out.println("Please input the numbers you would like to use for your ArrayList. When you are done type in -1 to finish");


		while(notNegative)
		{ 
			
			int nextNumber = userInput.nextInt();
			
			

			if(nextNumber >-1 && nextNumber <21 && nextNumber > 0)
			{
				myArray.add(nextNumber);
				System.out.println(myArray);
			}
			if(nextNumber <-1 || nextNumber > 20 || nextNumber == 0)
				{
				System.out.println("That is not a valid number. Please try again.");
				}
			if(nextNumber == -1)
			{
				break;
			}
		}
	
	Collections.sort(myArray);
		
	System.out.println("Your final unscramled ArrayList is"+myArray);
	int randomNum = (int) (Math.random()* myArray.size());
	int target = myArray.get(randomNum);

		System.out.println("\n\nYour target number is:  " + target);
		System.out.println("\n\nPlease enter correct answers to the following questions about binary search tracing:");
		System.out.println("\n\nPass#   Left   Right   Middle   numberLine[middle]");
}
	
	

	

}
