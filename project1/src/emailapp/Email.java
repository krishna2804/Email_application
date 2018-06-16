package emailapp;
import java.util.*;
import java.util.Scanner;

public class Email {
	private String first_name;
	private String last_name;
	private String password;
	private String department;
	private int mailbox_Capacity;
	private String alternate_mail;
	
	//firstname and lastname
	public Email(String firstname,String lastname)
	{
		first_name=firstname;
		last_name=lastname;
		System.out.println("Names:"+first_name+last_name);
		department=setDepartment();
		System.out.println("Department name:"+department);
	}
	
	//Ask for department
	private String setDepartment() 
	{
		System.out.println("Please select your department:");
		System.out.print("1-student\n2-faculty\n3-administration\n4-guest");
		Scanner input=new Scanner(System.in);
		int dep_in=input.nextInt();
		if (dep_in==1) {
			return "Student";
		}
		else if (dep_in==2) {
			return "faculty";
		}
		else if (dep_in==3) {
			return "administration";
		}
		else if (dep_in==4) {
			return "guest";
		}
		else {
			return "";
		}
		
		
	}
	
	//generate password
	
	//set the mailboxcapacity
	
	//set alternate mail
	
	//update password

}
