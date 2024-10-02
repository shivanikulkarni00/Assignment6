package assi6;
class A {
    
    public static void display() {
        System.out.println("Parent");
    }
}

class B extends A {
    
    public static void display() {
        System.out.println("Child");
    }
}

public class TestParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
        a.display();  // Parent

        
        B b = new B();
        b.display();  

       
        A ab = new B();
        ab.display(); 
	}

}
