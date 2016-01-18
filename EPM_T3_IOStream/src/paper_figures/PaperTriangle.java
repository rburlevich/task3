package paper_figures;


import figures.Color;
import figures.Triangle;

public class PaperTriangle extends Triangle implements Paper{
	
	Painting color = new Painting();
	
	public PaperTriangle(PaperCircle pCircle) {
		super(pCircle);
		
	}
	
	public PaperTriangle(PaperRectangle pTriangle) {
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
