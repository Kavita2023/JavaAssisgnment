package oops;

import java.util.Scanner;

public class Exampleoops5 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int emp_id=sc.nextInt();
		String emp_name=sc.next();
		Double emp_sal=sc.nextDouble();
		String emp_add=sc.next();
		String gender=sc.next();
		String email=sc.next();
		
		System.out.print(emp_name+" "+emp_sal+" "+emp_add+" "+gender+" "+email);
	}

}
