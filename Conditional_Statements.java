package variables;

public class Conditional_Statements {

	public static void main(String[] args) {
		String status = "pass";
		if (status == "pass") {
			System.out.println("qualified,wait for 1st round");
			String round1Status = "fail";
			if (round1Status == "pass") {
				System.out.println("qualified,wait for 2nd round");
				String round2Status = "pass";
				if (round2Status == "pass") {
					System.out.println("qualified,wait for hr round");
				} else {
					System.out.println("u can go to home");
				}
			} else {
				System.out.println("u can go to home");
			}
		} else {
			System.out.println("u can go to home");
		}

	}
}
