package paper_figures;

import figures.Color;

public interface Paper {
	
	Color getColor();
	boolean Paints(Color col);

	class Painting {
		Color color;
		
		public boolean setColor(Color col){
			if (color == null){
				color = col;
				return true;
			} else return false;
		}
		
		Color getColor(){
			return color;
		}
		
		 
	 }
}
