
class parent{
	
	public void fun() {
		System.out.println("I'm from parent fun");
	}
}


public class Methodhidding extends parent {
	
//	public void fun() {
//		System.out.println("I'm from child fun");
//	}

	public static void main(String[] args) {
	parent p= new Methodhidding();
	p.fun();
	Methodhidding m= new Methodhidding();
		m.fun();
			
	}

}
