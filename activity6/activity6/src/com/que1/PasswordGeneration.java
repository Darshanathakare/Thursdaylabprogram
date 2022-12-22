
//Author:Darshana Thakare
//password contain 8 characters one uppercase, one lowercase, one special characterpackage com.que1;

import java.util.*;
import java.util.regex.*;

public class PasswordGeneration {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Generate your Security Code");
		        String code = sc.next();
		        String regex = "[A-Za-z0-9@*#]{8}";
		        Pattern p = Pattern.compile(regex);
		        Matcher m = p.matcher(code);
		        boolean matchFound = m.find();
		        if(matchFound)
		        System.out.println("Security Code Generated Successfully");
		        else
		        System.out.println("Invalid Security Code, Try Again!");
		    
		

	}

}
