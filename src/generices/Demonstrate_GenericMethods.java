package generices;

;
public class Demonstrate_GenericMethods {
	void display() {

		System.out.println("generic method exmaple");

	}

	<T> void gdisplay(T e)

	{

		System.out.println(e.getClass().getName() + " = " + e);

	}

	public static void main(String[] args) {

		Demonstrate_GenericMethods g1 = new Demonstrate_GenericMethods();
		g1.display();
		g1.gdisplay(1);
		g1.gdisplay("harshad");
		g1.gdisplay(11.0);
	}

}
