package paper_figures;

import figures.Circle;
import figures.Color;



public class PaperCircle extends Circle implements Paper{
	
	Painting color = new Painting();

	public PaperCircle(PaperRectangle pRectangle) {
		super(pRectangle);
		
	}
	
	public PaperCircle(PaperTriangle pTriangle) {
		super(pTriangle);
		
	}

	@Override
	public Color getColor() {
		return color.getColor();
	}

	@Override
	public boolean Paints(Color col) {
		return color.setColor(col);
	}
	
}
