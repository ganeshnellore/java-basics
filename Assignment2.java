package variables;


import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the day today");
		String day =scanner.nextLine();
		if(day.equals("monday")||day.equals("tuesday")||day.equals("wednesday")||day.equals("thursday")||day.equals("friday")) { 
			System.out.println("its weekday😭");
			}
		else {
			System.out.println("ehh it's weekend😍!");
		}
		scanner.close(); 
	
	}
}
