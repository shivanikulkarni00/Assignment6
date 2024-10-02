package assi6;
class Person {



	final String name;

	final int age;



	public Person(String name, int age) {

		super();

		this.name = name;

		this.age = age;

	}



	public void getName(String name) {

		return;

	}



	public void setage(int age) {

		return;

	}



	public void display() {

		System.out.println("name is " + name + " and age is " + age);

	}

}
public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("shivani", 23);

		person.display();

		//person.setName("sayli"); values cant not ne changed

		//person.setage(28); values cant not ne changed

		

	}


	}


