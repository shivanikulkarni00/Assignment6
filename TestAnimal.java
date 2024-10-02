package assi6;
abstract class Animal {
    // Abstract method for animal sound
    abstract public void sound();

    // Abstract method for animal movement
    abstract public void move();
}

// Dog class extends Animal and provides implementation for sound() and move()
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks: Woof Woof");
    }

    @Override
    public void move() {
        System.out.println("Dog runs fast");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println(" Meow Meow");
    }

    @Override
    public void move() {
        System.out.println("Cat walks......");
    }
}


class Bird extends Animal {
    @Override
    public void sound() {
        System.out.println(" Tweet Tweet");
    }

    @Override
    public void move() {
        System.out.println("Bird flies");
    }
}

public class TestAnimal {

	public static void main(String[] args) {

		Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();

       
        System.out.println("Dog:");
        dog.sound();
        dog.move();

        System.out.println("\nCat:");
        cat.sound();
        cat.move();

        System.out.println("\nBird:");
        bird.sound();
        bird.move();
	}

}
