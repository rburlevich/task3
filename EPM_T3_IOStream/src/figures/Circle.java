package figures;


public class Circle extends Figure {
	float R;
	
	public Circle(float R) {
		this.R = R;
		
	}
	
	public Circle(Triangle tr) {           // cut Circle from Triangle
		R = tr.getArea()/(tr.getPerimeter()/2); 
	}
	
	public Circle(Rectangle rec) {         // cut Circle from Rectangle
		if (rec.hight >= rec.width){
			R = rec.width/2;
		} else {
			R = rec.hight/2;
		}
	}
	
	@Override
	public float getArea(){
		area = (float) (R*R*Math.PI);
		return area;
	}
		
	@Override
	public float getPerimeter() {
		perimeter = (float) (2*Math.PI*R);
		return perimeter;
	}

}