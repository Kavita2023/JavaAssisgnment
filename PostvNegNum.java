
public class PostvNegNum {
	//short a;
	public void Compare(int i) {
		if (i > 0) {
			System.out.println("Number is postive");
		}
		else {
			System.out.println("Number is negative");
		}
	}
	public static void main(String[] args) {
     PostvNegNum obj= new PostvNegNum();
     obj.Compare(10);
     obj.Compare(-1);
	}
	

}
