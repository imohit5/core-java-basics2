
public class InvokeNonStaticMethod {

	int num;
	
	InvokeNonStaticMethod () {
	System.out.println("Inside the constructor");	
	}
	
	{
		System.out.println("Inside non static block");
	}
	
	public static void main(String[] args) {
		System.out.println("Inside the main method");
		InvokeNonStaticMethod test1= new InvokeNonStaticMethod();
		test1.doInvoke();
		
	}
	
	//executes only once
	static {
		System.out.println("Inside the static block");
	}
	
	void doInvoke() {
		System.out.println("Inside doInvoke - Non Static Method");
	}
}
