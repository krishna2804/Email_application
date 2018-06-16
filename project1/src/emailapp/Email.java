package emailapp;
import java.util.*;
import java.util.Scanner;
import java.util.Random;
public class Email {
	private String first_name;
	private String last_name;
	private String password;
	private int length=10;
	private String department;
	private int mailbox_Capacity=500;
	private String alternate_mail;
	private String companysuffix=".company.com";
	private String email;
	
	//firstname and lastname
	public Email(String firstname,String lastname)
	{
		first_name=firstname;
		last_name=lastname;
		//System.out.println("Names:"+first_name+last_name);
		
		department=setDepartment();
		//System.out.println("Department name:"+department);
		
		password=setPassword(length);
		//System.out.println("password name:"+password);
		
		// creating email
		email=first_name.toLowerCase()+"."+last_name.toLowerCase()+"@"+department+companysuffix;
		
		//System.out.print(email);

		
	}
	
	//Ask for department
	private String setDepartment()
	{
		System.out.println("Please select your department:");
		System.out.print("1-student\n2-faculty\n3-administration\n4-guest\n");
		Scanner input=new Scanner(System.in);
		System.out.print("Please select your department id-:");

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
	
	//generate random password
	private String setPassword(int size) {
		String pass_chars="ABCDEFGHIJKLMNOPQSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz@*!-_";
		char [] passwd=new char[size];
		Random r =new Random();
		for(int i=0;i<size;i++) {
			
			int randitem=r.nextInt(pass_chars.length());
			//System.out.println("randitem"+randitem);

			passwd[i]=pass_chars.charAt(randitem);
			//System.out.println("passitem=="+passwd[i]);

		}
		
		return new String(passwd);
		
		
		
		
		
	}
	
	
	//set the mailboxcapacity
	public void setmailboxcapacity(int capacity) {
		mailbox_Capacity=capacity;
	}
	
	
	//set alternate mail
	public void setalternatemail(String newmail) {
		alternate_mail=newmail;
	}
	//update password
	public void setnewpassword(String newpass) {
		password=newpass;
	}

	public int getmailboxcapacity() {
		return mailbox_Capacity;
	}
	
	public String getalternatemail() {
		return alternate_mail;
	}
	
	public String getnewpassword() {
		return password;
	}
	
	public String profile() {
		System.out.println("************YOUR PROFILE****************");

		return "Diplay name:"+first_name+" "+last_name+"\nCOMPANY MAIL:"+email+"\nMAILBOX CAPACITY:"+mailbox_Capacity+"mb";
	}
}
