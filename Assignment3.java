package variables;

import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
//		System.out.println("Enter the number");
//		int i= scanner.nextInt();
//		int x;
//		if(i>0) {
//			x=1;
//		}
//		else {
//			if(i<0) {
//				x=-1;
//			}
//			else {
//				x=0;
//			}
//		}
//		switch(x) {
//		case 1:
//			System.out.println("positive number");
//			break;
//		case -1:
//			System.out.println("negative number");
//		    break;
//		case 0:
//			System.out.println("zero");
//			break;
//		default:
//			System.err.println("invalid input");
//			break;
//		
//		
//		
//		}
		System.out.println("enter day");
		String day=scanner.nextLine();
		day=day.toLowerCase();
		switch(day) {
		case "monday":
		case "tuesday":
		case "wednesday":
		case "thursday":
		case "friday":
			System.out.println("uff its weekday");
		    break;
		case "saturday":
		case "sunday":
			System.out.println("eyy its weekend");
			break;
		default:
			System.err.println("invalid input");
		}
		
		
	scanner.close();	
	
	}

}
