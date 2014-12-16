import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class MainQuizzer {
	public static ArrayList <Integer> myArray = new ArrayList<Integer>();
	static boolean notNegative = true;
	static Scanner userInput = new Scanner (System.in);
	private static int left = 0;
	private static int right = myArray.size() -1;
	private static int middle = (left + right) / 2;
	private static int leftGuess;
	private static int rightGuess;
	private static int middleGuess;
	private static int counter = 0;
	public static void main(String[] args)
		{
		derp();
		herp();
		if(leftGuess == left && rightGuess == right && middleGuess == middle)
		{
		counter = counter + 3;
				herp();
		}
	else if(leftGuess == left && rightGuess == right && middleGuess != middle || leftGuess == left && rightGuess != right && middleGuess == middle || leftGuess != left && rightGuess == right && middleGuess == middle)
		{
		counter = counter + 2;
		herp();
		}
	else if(leftGuess == left && rightGuess != right && middleGuess != middle || leftGuess != left && rightGuess == right && middleGuess != middle || leftGuess != left && rightGuess != right && middleGuess == middle )
		{
		counter++;
		herp();
		}
	else
		{
		herp();
		}
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
	
	public static void herp()
		{
		Scanner userInput2 = new Scanner(System.in);
		leftGuess = userInput2.next();
		Scanner userInput3 = new Scanner(System.in);
		rightGuess = userInput3.next();
		Scanner userInput4 = new Scanner(System.in);
		middleGuess = userInput4.next();
		
			if (target < (int) guessArray.get(middle))
				{
				right = middle - 1;
				} else if (target > (int) guessArray.get(middle))
				{
				left = middle + 1;
				} else
				{
				return middle;
				}
		return -1;
		}
	
	

	

}
