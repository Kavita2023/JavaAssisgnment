package oops;

import java.util.Scanner;

public class Exampleoops5 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter employee id:");
		int emp_id=sc.nextInt();
		System.out.print("Enter employee name:");
		String emp_name=sc.next();
		System.out.print("Enter employee salary:");
		Double emp_sal=sc.nextDouble();
		System.out.print("Enter employee add:");
		String emp_add=sc.next();
		System.out.print("Enter employee gender:");
		String gender=sc.next();
		System.out.print("Enter employee email:");
		String email=sc.next();
		
		System.out.print(emp_name+" "+emp_sal+" "+emp_add+" "+gender+" "+email);
		sc.close();
	}

}
