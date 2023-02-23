package Pack1;
import java.util.Scanner;

public class Exampleoops3 {

	boolean checkNumber(int n)
	{
		int num=n;
		boolean increase=true,decrease=true;
		int prev=num%10;
		while(num!=0) {
			int d=num%10;
			if(prev<d) {
				increase=false;
				break;
			}
			prev=d;
			num=num/10;
		}
		num=n;
		prev=num%10;
		while(num!=0) {
			int d=num%10;
			if(d<prev) {
				decrease=false;
				break;
			}
			prev=d;
			num=num/10;
		}
		if(!increase && !decrease) {
			return true;
		}
		return false;
	}

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		Exampleoops3 q=new Exampleoops3();
		boolean ans=q.checkNumber(i);
		if(ans)System.out.print("Increasing number");
		else System.out.print("Not Increasing number");
	}
}
