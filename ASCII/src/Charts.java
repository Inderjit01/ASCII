import java.util.Scanner;

public class Charts 
{
	public static void main(String[] args)
	{
		int choice, count;
		
		Scanner keyboard = new Scanner(System.in);
		
		do
		{
			System.out.println("Please select from the following menu options ");
			System.out.println("to see the printable character of the ASCII Chart");
			System.out.println("using various loops, or enter 0 to exit the program:");
			System.out.println();
			
			System.out.println("1: For Loop");
			System.out.println("2: While Loop");
			System.out.println("3: Do-While Loop");
			System.out.println("0: Exit program");
			choice = keyboard.nextInt();
			
			switch (choice)
			{
			case 1:
				System.out.println();
				System.out.println("The ASCII Chart Using a for Loop");
				System.out.println();
				
				for (count = 33; count < 127; count++)
				{
					
					System.out.printf("%3d = %-2c", count, (char)count);//every loop needs this
					
					if(count % 8 == 0)
						System.out.println();
				} // end for
				
				System.out.println();
				System.out.println();
				break;
			
			case 2:
				System.out.println();
				System.out.println("The ASCII Chart using a While Loop");
				System.out.println();
				
				count = 33;
				while (count < 127)
				{
					System.out.printf("%3d = %-2c", count, (char)count);//every loop needs this
					
					if(count % 8 == 0)
						System.out.println();
						count++;
					//The body of the while loop is the same as for loop, except you need to add to count
				}// end while
				
				System.out.println();
				System.out.println();
				break;
				
			case 3:
				System.out.println();
				System.out.println("The ASCII Chart Using a DO-While Loop");
				System.out.println();
				
				// be sure you reset count outside the loop
				count = 33;
				do
				{
					System.out.printf("%3d = %-2c", count, (char)count);//every loop needs this
					
					if(count % 8 == 0)
						System.out.println();
						count++;

					// The body of the do-while is identical to the while loop
					// you can copy and paste the body from the while loop
				} while (count < 127);// same condition as for and while loop);
				
				System.out.println();
				System.out.println();
				break;
				
			case 0:
				System.out.println();
				System.out.println("Exiting program.");
				System.out.println();
				break;
				
			default:
				System.out.println();
				System.out.println("Invaild choice, please try again.");
				System.out.println();
				break;
				
			} // end switch
			
		
		
		} while(choice != 0);
		
		keyboard.close();
		
	} // end main

} // end class
