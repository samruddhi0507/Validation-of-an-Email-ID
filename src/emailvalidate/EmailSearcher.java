package emailvalidate;

public class EmailSearcher{
	String[] emails =  { 
			"samruddhirandive@gmail.com" ,
			"samruddhi57@yahoo.com" ,
			"sam05@hotmail.com",
			"samruddhi_domain@company.com" ,
			"example@yahoo.com", 
			"example@google.com",
			"user@domain.com", 
			"user@domain.co.in", 
			"user.name1@domain.com", 
			"user_name1@domain.com", 
			"user@yahoo.corporate.in"
	};
	
	
	public boolean SearchEmail(String emailToSearch) {
		
		for (String email : emails) {
			if (email.contentEquals(emailToSearch)) {
				return true;
			}
		}
		return false;
	}
}