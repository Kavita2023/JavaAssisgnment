package com.Exception;
import java.util.Scanner;

class InvalidCredentialException extends Exception {
	private String username, password;
	public InvalidCredentialException(String password) 
	{
		this.password=password;
	}
	public String toString() {
		return "your password is incorrect  :"+password;
	}}
public class ExceptionAssgnmnt1 
{
   static void validation(String password)  throws InvalidCredentialException
       {
     if(password.contentEquals("Ericsson@123"))
    	 System.out.println("Login successful"); 
     else
      
     throw new InvalidCredentialException(password);
   }
   public static void main(String args[])
   {
						try {
							
							Scanner sc=new Scanner(System.in);
							System.out.print("Enter username:");
							String username=sc.next();
							System.out.print("Enter password:");
							String password=sc.next();
							ExceptionAssgnmnt1.validation(password);
							sc.close();
						} catch (InvalidCredentialException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
					
							
						}	
						finally {
							System.out.println("You are loggedout");
						}
   System.out.println("rest of the code...");
}
}

