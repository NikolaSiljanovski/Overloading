class A{
public void do_it () {
	System.out.println("A");
} public void do_it (String str) {
	System.out.println(str);
}
	
	
}












public class classB {

	public static void main(String[] args) {
		A object = new A();
		object.do_it("B");
		
	}

}
