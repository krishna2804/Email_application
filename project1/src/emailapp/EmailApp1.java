package emailapp;

public class EmailApp1 {
	
	public static void main(String[] args) 
	{
		Email mail=new Email("king","raju");
		mail.setalternatemail("kkkrt.com");
		String newmail=mail.getalternatemail();
		//System.out.println(newmail);
		
		String data=mail.profile();
		System.out.println(data);
		
	}
	

}
