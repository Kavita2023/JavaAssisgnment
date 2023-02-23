package oops;

import java.util.Scanner;

public class ExampleOops1 {
	
	int calculateSum(int a)
	{
		int sum=0;
		for(int i=1;i<=a;i++) {
			if(i%3==0 || i%5==0) {
				sum+=i;
			}
		}
		return sum;
	}

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Input :");
		int i=sc.nextInt();
		ExampleOops1 q=new ExampleOops1();
		int sum=q.calculateSum(i);
		System.out.print(sum);
		sc.close();
	}
}
