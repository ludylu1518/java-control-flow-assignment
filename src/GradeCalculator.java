import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
		// 1. Initialize any variables and objects you need (i.e. a scanner, some
		// counters for a total running sum, and a number tracking the # of scores inputted
		Scanner scan = new Scanner(System.in);
		
		// add the grades up
		int total = 0;
		
		// keep track of how many grades received
		int counter = 0;

		// 2. Make a loop that repeatedly asks the user for a number and won't stop
		// until the user answers using a negative number
		// 3. Add some error checking for when a user inputs a number over 100 - we
		// should skip that input and start the loop
		// over to ask again
		
		while (true) {
			System.out.println("Enter a grade, to exit enter a negative number.");
			
			// looks for the next integer
			int grade = scan.nextInt();
			
			if (grade >= 0 && grade <= 100) {
				total += grade;
				counter++;
				
			} else if (grade > 100) {
				System.out.println("A grade cannot be greater than 100!");
				
			} else {
				// if negative number break out of the loop
				break;
				
			}
		}
		
		
		
		
		// 4. Calculate the average of all scores collected during the loop
		
		int averageGrade = 0;
		
		// just in case user enter a negative number as first input. 
		if (counter > 0) {
			averageGrade = total / counter;
		}
		

		
		// 5. Display the average grade and corresponding message
		// - If over 90: "Excellent Work!"
		// - If over 80: "Good Job!"
		// - If over 70: "Keep it up!"
		// - anything else: "Let's work hard to get those grades up!"
		
		System.out.printf("Your average grade is: %d, ", averageGrade);

		if (averageGrade > 90) {
			System.out.println("Excellent Work!");
			
		} else if (averageGrade > 80) {
			System.out.println("Good Job!");
			
		} else if (averageGrade > 70) {
			System.out.println("Keep it up!");
			
		} else {
			System.out.println("Let's work hard to get those grades up!");
			
		}
		
		
		
	}
}