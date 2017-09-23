
public class StaticBlockObjectReferenceTwo {

	static StaticBlockObjectReferenceTwo test1;
	
	static {
		 
		System.out.println(StaticBlockObjectReferenceTwo.test1);
		StaticBlockObjectReferenceTwo.test1 = new StaticBlockObjectReferenceTwo();
	}
	
	public static void main(String[] args) {
		System.out.println(StaticBlockObjectReferenceTwo.test1);
	}
}