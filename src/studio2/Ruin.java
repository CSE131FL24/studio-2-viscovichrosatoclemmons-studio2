package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
	System.out.println("What is the initial amount of money?");
	int startAmount = in.nextInt();
	System.out.println("What is the probability that you win?");
	double winChance = in.nextDouble();
	System.out.println("What is the win limit?");
	int winLimit = in.nextInt();
	
	System.out.println("Start Amount: " + startAmount);
	System.out.println("Win Probability: " + winChance);
	System.out.println("Win Limit: " + winLimit);
	

	System.out.println("How many days did you play?");
	int totalSimulations = in.nextInt();
	
	for (int rounds = 0; rounds <= totalSimulations; rounds++) {
	while (startAmount<winLimit && startAmount>0) {
		double random = Math.random();
		if (random < winChance) {
				startAmount += 1 ;
		
	}
		else {
			startAmount -= 1;
		
	}}
	 
	if (startAmount == winLimit) {
		System.out.println("Success.");}
	else {
		System.out.println("Failure.");}
	}
	
	System.out.println("Days: "); 
	
} } 
