package figures;

public class Triangle extends Figure {
	
	float side1, side2, side3;
		
	
	public Triangle(float side1, float side2, float side3) {
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	
	public Triangle(Circle cir) {          // cut Triangle from Circle
		side1 = side2 = side3 = cir.R*3/((float) Math.sqrt(3));
	}
	
	public Triangle(Rectangle rec) {      // cut Triangle from Rectangle
		if (rec.hight >= rec.width){
			side1 = side2 = side3 = rec.width;
		} else {
			side1 = side2 = side3 = rec.hight;
		}
	}
	
	@Override
	public float getArea() {
		float pP = perimeter/2;
		area=(float) Math.sqrt(pP*(pP-side1)*(pP-side2)*(pP-side3));
		return area;
	}

	@Override
	public float getPerimeter() {
		perimeter=side1+side2+side3;
		return perimeter;
	}
	
		
}

