import java.util.*;

/*******************************
 * Name: Your name Class: ICS3U Date: Friday Sept. 25 Project Name: Restaurant
 * 
 * You will have your first real project this week. You must meet all of the
 * following criteria: Create a restaurant of your choosing Print menu items one
 * at a time, including the price. Ask how many of each item they would like to
 * purchase Must have at least 5 different menu items Calculate the total price
 * If the total is more than $30, take off 10%. If the total is more than $50,
 * take off 20%. Add 13% HST to the total Print out the initial price, any
 * discounts, taxes, and the grand total. Read in a payment amount from the user
 * Calculate the change If the change is negative, state that they still owe you
 * money. This is to be done individually. DO NOT use AI! Feel free to use
 * previous notes, videos, and online resources like w3schools.com Fork the
 * repository, add me (MrZebarth) as a collaborator, clone the repository to
 * your computer, program your solution, and then commit and push the results.
 ********************************/
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double discount=0;
		System.out.println("Welcome to the Restaurant!");
		System.out.println("The weekly specials are Fries 2$, Hot Dogs 5$, Onion Rings 3$, Water 1$, Cheeseburger 5$ ");
		System.out.println("What Will it be?");
		System.out.println("How Many Hot Dogs do you want?");
		int HotDogs = in.nextInt();
		System.out.println("How many Fries do you want?");
		int fries = in.nextInt();
		System.out.println("How many Onion Rings do you want?");
		int OnionRings = in.nextInt();
		System.out.println("How many Bottles of Water do you want?");
		int Water = in.nextInt();
		System.out.println("How many Cheeseburgers do you want?");
		int Cheeseburgers = in.nextInt();
		double total = (HotDogs * 5.65) + (fries * 2.26) + (OnionRings * 3.39) + (Water * 1.13)
				+ (Cheeseburgers * 5.65);
		System.out.println("Total $" + total + "");
		if (total > 50) {
			discount = total * 20 / 100;

		} else if (total > 30) {
			
		}

	}
}