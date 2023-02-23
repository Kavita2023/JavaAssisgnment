package oops;

import java.util.Scanner;

public class Exampleoops4 {
	

	Boolean checkNumber(int n)
	{
		int num=n;
		while(num!=1)
		{
			if(num%2==0)
				num=num/2;
			else
				return false;
		}
		return true;
	}

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		Exampleoops4 obj=new Exampleoops4();
		Boolean ans=obj.checkNumber(a);
		if(ans)System.out.print("Power of 2");
		else System.out.print("Not power of 2");
	}

}
