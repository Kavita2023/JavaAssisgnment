

import java.util.Scanner;

public class ScannerExample {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter employee id:");
		int employeeid=sc.nextInt();
		System.out.print("Enter employee name:");
		String empployename=sc.next();
		System.out.print("Enter employee salary:");
		Double empployesal=sc.nextDouble();
		System.out.print("Enter employee add:");
		String empployeadd=sc.next();
		System.out.print("Enter employee gender:");
		String gender=sc.next();
		System.out.print("Enter employee contact:");
		Long empployecontact=sc.nextLong();
		//System.out.print("Enter employee name:"+ empployename);
		System.out.print(employeeid+" "+empployename+" "+ empployesal+" "+empployeadd+" "+gender+" "+empployecontact);
		sc.close();
	}
}

