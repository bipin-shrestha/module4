//Import the necessary library
import java.util.Scanner;
//Define class module4 
public class module4 {
	//Define the main method
	public static void main(String[] args) {
		//create scanner object
		Scanner scanner = new Scanner(System.in);
		//Initializing the variables
		float total = 0;
		//To set the smallest value
		float maximum = 0;
		//To set the biggest value
		float minimum = 100;
		//Prompt the user to enter the grades 
		System.out.println("Please enter all ten floating-point Grades");		
		for(int i=1; i<=10; i++) {
			System.out.println("Enter grade of "+ i + " :");
			//Checking to see if the input is valid floating point number 
			if(scanner.hasNextFloat()) {
				float grade = scanner.nextFloat();
				if (grade <= 100) {
					//Update total, maximum and minimum value
					total = total + grade;
					
					if (grade > maximum) {
						maximum = grade;
					}
					if (grade < minimum) {
						minimum = grade;
					}
				}else {
					System.out.println("Error input. Grade cannot be greater than 100.");					
					//Decrement the counter of the loop to re-enter the valid grade
					i--;
				}				
			} else {
				System.out.println("Error input. Please enter the valid grade.");
				// Clear the Invalid input
				scanner.next();
				//Decrement the counter of the loop to re-enter the valid grade
				i--;
			}			
		}
		//Calculate the average of the grades
		float average = total /10;
		System.out.println("Average of grades : " + average);
		//Display Maximum grades
		System.out.println("Maximum grades : " + maximum);
		//Display Minimum grades
		System.out.println("Minimum grades : " + minimum);
		//Closing the scanner
		scanner.close();
	}

}
