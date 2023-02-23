
public class DisplayWeek {
	public void week(int a, int b, int c , int d, int e, int f, int g) {
		int num = 3;
		if (num==a) {
			System.out.println("Monday");
		}
		if (num==b) {
			System.out.println("Tuesday");
		}
		if (num==c) {
			System.out.println("Wednesday");
		}
		if (num==d) {
			System.out.println("Thursday");
		}
		if (num==e) {
			System.out.println("Friday");
		}
		if (num==f) {
			System.out.println("Saturday");
		}
		if (num==g) {
			System.out.println("Sunday");
		}
	}
	public static void main(String[] args) {
		DisplayWeek obj= new DisplayWeek();
	     obj.week(3, 4, 6, 7, 9,2,1);
}
}
