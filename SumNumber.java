
public class SumNumber {
	public void addoftwo(int a ,int b, int c, int d, int e) {
		int result= a+b+c+d+e;
		System.out.println("The sum of numbers" + result);
	}
	public void avg(int a ,int b, int c, int d, int e) {
		int result= (a+b+c+d+e)/5;
		System.out.println("The avg of numbers" + result);
	}
	public static void main(String[] args) {
		SumNumber obj = new SumNumber();
		obj.addoftwo(3, 5, 8, 10, 20);
		obj.avg(3, 5, 8, 10, 20);
	}
}
