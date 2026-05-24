package variables;

import java.util.Scanner;

public class assignment1 {
	public static void main(String[] args) {
		System.out.println("enter the stud marks");
		Scanner scanner = new Scanner(System.in);
		int marks = scanner.nextInt();
		if (marks > 85) {
			System.out.println("first class ");
		} 
		else {
			if (marks > 70 && marks <= 85) {
				System.out.println("second class");
			}
			else {
				if (marks > 35 && marks <= 70) {
					System.out.println("third class");
				}
				else {
					if (marks == 35) {
						System.out.println("u passed on border line,lucky bastard!");
					}

					else {
						System.out.println("ur cokked u failed");
					}
				}
			}
		}
		
		scanner.close();
	}
}
