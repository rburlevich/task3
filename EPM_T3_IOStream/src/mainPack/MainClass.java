package mainPack;


import figures.Circle;
import box.Box;
import figures.Rectangle;
import figures.Triangle;

public class MainClass {
	public static void main(String args[]){
		Circle circle1 = new Circle(10);
		Rectangle rectangle1 = new Rectangle(10, 15);
		Triangle triangle1 = new Triangle(10, 20, 15);
		
		System.out.println("Perimeter of circle1 = " + circle1.getPerimeter() + " / Area of circle1 = " + circle1.getArea());
		System.out.println("Perimeter of rectangle1 = " + rectangle1.getPerimeter() + " / Area of rectangle1 = " + rectangle1.getArea());
		System.out.println("Perimeter of triangle1 = " + triangle1.getPerimeter() +  " / Area of triangle1 = " + triangle1.getArea());
		
		System.out.println("\n-----------------------Circle--------------------------------------\n");
		
		Circle circle2 = new Circle(triangle1);
		System.out.println("Perimeter of circle2 = " + circle2.getPerimeter() + " / Area of circle2 = " + circle2.getArea());
		
		Circle circle3 = new Circle(rectangle1);
		System.out.println("Perimeter of circle3 = " + circle3.getPerimeter() + " / Area of circle3 = " + circle3.getArea());
		
        System.out.println("\n-----------------------Rectangle-----------------------------------\n");
		
        Rectangle rectangle2 = new Rectangle(circle3);
		System.out.println("Perimeter of rectangle2 = " + rectangle2.getPerimeter() + " / Area of rectangle2 = " + rectangle2.getArea());
		
		Rectangle rectangle3 = new Rectangle(triangle1);
		System.out.println("Perimeter of rectangle3 = " + rectangle3.getPerimeter() + " / Area of rectangle3 = " + rectangle3.getArea());
		
        System.out.println("\n-----------------------Triangle------------------------------------\n");
        
		Triangle triangle2 = new Triangle(circle2);
		System.out.println("Perimeter of triangle2 = " + triangle2.getPerimeter() + " / Area of triangle2 = " + triangle2.getArea());

		Triangle triangle3 = new Triangle(rectangle1);
		System.out.println("Perimeter of triangle3 = " + triangle3.getPerimeter() + " / Area of triangle3 = " + triangle3.getArea());
	
	    Box box1 = new Box(3);
	    
	    box1.addFigure(rectangle3);
	    box1.addFigure(triangle2);
	    box1.addFigure(triangle1);
	    //box1.addFigure(circle2);
	   // System.out.println("Perimetr =" + box1.getFigureByNumber(0).getPerimeter());
	    //box1.takeFigure(2);
	   // box1.takeFigure(5);
	    System.out.println("Count = " + box1.countOfFigures());
	    float z = rectangle3.getPerimeter() + triangle2.getPerimeter() + triangle1.getPerimeter();
	    System.out.println("Perim = " + z);
	    System.out.println("Perim = " + box1.getFullPerimeter());
	    
	    float z2 = rectangle3.getArea() + triangle2.getArea() + triangle1.getArea();
	    System.out.println("Perim = " + z2);
	    System.out.println("Perim = " + box1.getFullArea());
	    
	}

}
