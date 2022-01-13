package emailvalidate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
//needs @ sign in domain
//needs at least a "." in domain
//last group of letters need to be 2-3 characters
//use regex to search for key components


//final String regex = "\\w+\\@\\w+\\.\\w+";

final String regex = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";

final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);



public boolean Validate (String email) {
	Matcher matcher = pattern.matcher(email);
	
	if (matcher.find()) {
		return true;
	}
	else 
		return false;
}
}

