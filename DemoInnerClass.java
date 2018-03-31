
class Phone {

	public void show() {
		System.out.println("Callig..");
	}
}

class SmartPhone extends Phone{

	public void show() {
		System.out.println("Call, Sms....");
	}
}

interface Phone1 {

	void show();
}

// 1. Member class non static class 
// 2. Static inner class 
// 3. Anonymous class 

class A{

	int i;

	class B {

		// How to access j 
		int j;

	}

	static class B1 {

		int j;
	}
}


public class DemoInnerClass {
	
	public static void main(String[] args) {

		A obj = new A();
		obj.i = 5;
		System.out.println(obj.i);
		// member non static class 
		A.B obj1 = obj.new B();
		obj1.j = 4;
		System.out.println(obj1.j);

		// Static class 
		A.B1 obj2 = new A.B1();


		System.out.println(obj2.j);


		Phone phone = new Phone()
						{
							public void show() {
								System.out.println("Calling, inner class");
							}
						};
		phone.show();


		Phone1 p1 = new Phone1() {

			public void show() {
				System.out.println("Inner class using interface");
			}
		};

		p1.show();
	}
}





