
public class GreatestNumber {
	public int Compare( int a, int b, int c) {
		if (a> b && a>c) {
	       return a ;
			}
		else if (a>b && c>a) {
			return c;
		}
		else {
			return b;
		}
	}
	public static void main(String[] args) {
		GreatestNumber obj = new GreatestNumber();
		System.out.println(obj.Compare(30,100,78));
	}
}
