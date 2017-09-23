
public class DemoThisKeyword {

	int x;
	
	public DemoThisKeyword() {
		System.out.println(this);
		System.out.println(this.x);
	}
	
	public DemoThisKeyword(int x) {
		this.x = x;
		System.out.println(this);
		System.out.println(this.x);
	}
	
	public static void main(String[] args) {
		new DemoThisKeyword();
		new DemoThisKeyword();
		new DemoThisKeyword();
		
		new DemoThisKeyword(1);
		new DemoThisKeyword(2);
		new DemoThisKeyword(3);
	}
}
