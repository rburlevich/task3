package figures;

public class Rectangle extends Figure {
	float hight, width;
	
	public Rectangle(float hight, float width) {
		this.hight = hight;
		this.width = width;
		
	}
	
	public Rectangle(Circle c) {   // cut Rectangle from Circle
		hight = width = c.R/((float)Math.sqrt(2));
	}
	
	public Rectangle(Triangle tr) {   // cut Rectangle from Triangle
		hight = width = tr.side1/2;
		
	}

	@Override
	public float getArea() {
		area = hight*width;
		return area;
	}
	
	@Override
	public float getPerimeter() {
		perimeter = (width+hight)*2;
		return perimeter;
	}
	
	public String toString(){
		return "Perimetr = " + getPerimeter();
		
	}

}
