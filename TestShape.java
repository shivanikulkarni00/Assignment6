package assi6;
abstract class GeometricShape{

	abstract public void Area();

	abstract public void Perimeter();

}

class Circle extends GeometricShape{

	 final double PI=3.14;

	 private int radius;

	 

	public Circle(int radius) {

		super();

		this.radius = radius;

	}

	 public void Area()

	 {

		 System.out.println("area of circle"+PI*radius*radius);

	 }

	 public void Perimeter()

	 {

		 System.out.println("perimeter of circle"+2*PI*radius);

	 }
}
	 class Rectangle extends GeometricShape{

		private int length;

		 private int breadth;

		 

		public Rectangle(int length,int breadth) {

			super();

			this.length = length;

			this.breadth=breadth;

		}

		 public void Area()

		 {

			 System.out.println("area of ractangle"+length*breadth);

		 }

		 public void Perimeter()

		 {

			 System.out.println("perimeter of rectangle"+2*(length+breadth));

		 }

}
	 class Triangle extends GeometricShape{

		 private int base;
		    private int height;
		    private int a, b, c; 

		    public Triangle(int base, int height, int a, int b, int c) {
		        super();
		        this.base = base;
		        this.height = height;
		        this.a = a;
		        this.b = b;
		        this.c = c;
		    }

		    public void Area() {
		        System.out.println("Area of triangle: " + (0.5 * base * height));
		    }

		    public void Perimeter() {
		        System.out.println("Perimeter of triangle: " + (a + b + c));
		    }
		}

public class TestShape {
	public static void main(String[] args) {
      
        Circle circle = new Circle(5);
        circle.Area();
        circle.Perimeter();

       
        Rectangle rectangle = new Rectangle(3,6);
        rectangle.Area();
        rectangle.Perimeter();

        
        Triangle triangle = new Triangle(3, 4, 3, 4, 5);
        triangle.Area();
        triangle.Perimeter();
    }
}
