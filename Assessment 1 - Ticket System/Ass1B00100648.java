//Programmer: Emma Brady
//Stident ID: B00100648
//Date Written: 23rd October 2017
//Function: Prompt price theatre tickets
//Note: Write a program that reads ticket details from the user and outputs those details in the form of a Theatre ticket

import java.util.Scanner; //importing scanner class
class Ass1B00100648
{
	public static void main (String [] args)
	{
		String film; 			//Defining film
		String surname; 		//Defining surname
		int group;    			//Defining no of people
		double price;			//Defining price of tickets
		String loop = null;     //Defining do while loop varible
		int loopCount = 0;		//Defining loopcount

		Scanner myInput = new Scanner(System.in);

		price = 0; //Setting price to 0

		do // Do/While Loop
		{

		//Welcoming message for the customer

		System.out.println("***************************************************************");
		System.out.println("Welcome to the MSL Cimena Group");
		System.out.println("Promo Offer more than 6 in a group will get a 10% discount!!!)");
		System.out.println("***************************************************************");

		//Message prompting the customer imput

		System.out.println("Please enter the film you are viewing:" );
		System.out.println("1 = Bad Boyz" );
		System.out.println("2 = The NoteBook" );
		System.out.println("3 = The Haunting" );
		System.out.println("4 = Saw" );
		film = myInput.next();

		System.out.println("***************************************************************");

		switch(film) //Implementation of Switch statement
		{
		case "1":film = "Bad Boyz"; System.out.println("The film you have chosen is: " + film ); break;
		case "2":film = "The NoteBook"; System.out.println("The film you have chosen is: " + film ); break;
		case "3":film = "The Haunting"; System.out.println("The film you have chosen is: " + film ); break;
		case "4":film = "Saw"; System.out.println("The film you have chosen is: " + film ); break;
	}

		System.out.println("***************************************************************");
		System.out.println("Please enter your surname: " );
		surname = myInput.next();
		System.out.println("***************************************************************");
		System.out.println("Please enter the amount of people: " );
		group = myInput.nextInt();
		System.out.println("***************************************************************");

		if(group <=6){	//Implementation of If Statement
		price = group * 25;
		System.out.println("Your total ticket price is: " +price );
		}
		if(group >6){
		price = group * (25 * .90);
		System.out.println("Your total ticket price including discount is: " +price );
		}

		System.out.println("***************************************************************");
		System.out.println("Show: " + film + "\n" + "Surname: "  + surname + "\n" + "Group: " + group + "\n" + "Price: " + price + "\n" );

		System.out.println("***************************************************************");
		System.out.println("Would you like to process another ticket? ");
		System.out.println("Y/N ");
		loop = myInput.next();
		loopCount++;


	}
		while (loop.equalsIgnoreCase("Y"));

		System.out.println("The number of tickets in this transaction was "+loopCount);

	} //End main method
} //End class



