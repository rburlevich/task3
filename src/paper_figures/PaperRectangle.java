package paper_figures;

import figures.Rectangle;
import figures.Color;

public class PaperRectangle extends Rectangle implements Paper {
	
	Painting color = new Painting();

	public PaperRectangle(PaperCircle pCircle) {
		super(pCircle);
	}
	
	public PaperRectangle(PaperTriangle pTriangle) {
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