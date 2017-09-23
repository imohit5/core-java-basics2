
public class StaticMethodReference {

	static StaticMethodReference test1 = new StaticMethodReference();
	
	static {
		 
		System.out.println("static block"+StaticMethodReference.test1);
		StaticMethodReference.test1 = StaticMethodReference.init();
	}
	
	public static void main(String[] args) {
		System.out.println("main"+StaticMethodReference.test1);
	}
	
	static StaticMethodReference init() {
		//StaticMethodReference.test1 = new StaticMethodReference();
		System.out.println("static method"+StaticMethodReference.test1);
		return new StaticMethodReference();
		
	}
}