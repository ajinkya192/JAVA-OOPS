package polymorphism;

public class Methodoverloading {

	public static void main(String[] args) {
		Methodoverloading ac = new Methodoverloading();
		ac.chaitu(1, 2);
	}
	
	public void chaitu(int a, int b) {
		a = 5;
		b =1;
		System.out.println(a+b);
	}
	
	public void chaitu(String be ) {
		System.out.println("belo");
		
	}
	
	public void chaitu(String aji, int v, int a) {
		System.out.println("***");
	}

}
