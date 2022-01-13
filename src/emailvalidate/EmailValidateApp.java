package emailvalidate;

import java.util.Scanner;

public class EmailValidateApp {

	public static void main (String[] args) {
		
		String email;
		try (Scanner input = new Scanner(System.in)) {
			String action = "no";
			while (action.contentEquals("no")) {
				System.out.print("Please enter email address: ");
				email = input.next();
				System.out.println();
			
				EmailValidator emailValidator = new EmailValidator();
				System.out.println(emailValidator.Validate(email) ? "Valid email address enterd \n" : "Invalid email address entered \n");
			
				// if email is valid, then the email will be searched for in array 
				if (emailValidator.Validate(email) == true) {
					EmailSearcher emailSearcher = new EmailSearcher();
					System.out.println(emailSearcher.SearchEmail(email) ? "Email Address Found in Database \n" : "Email Address Not Found in Database \n");
				}
				System.out.print("Would you like to exit? (yes or no): ");
				action = input.next();
			}
		}
		System.out.println("Thank you for using this program. Have a wonderful day.");
		
	}
}
