package polymorphism;

public class MetodOverriding_CHILD extends MethodOverriding_PARENT {

	public static void main(String[] args) {
		MetodOverriding_CHILD ac = new MetodOverriding_CHILD();
		ac.NAME();
		ac.NAME1();
		

	}
	
	public void NAME1() {
		System.out.println("chaitu");
	}

}
