package box;

import figures.Figure;

public class Box {
	int n;
	public Figure[] boxWithFigures;
	
	public Box(int n){
		this.n = n;
		boxWithFigures = new Figure[n];
	}
	
	public void addFigure(Figure figure){
		for (int i=0; i<=boxWithFigures.length-1; i++){
			if (boxWithFigures[i]==null){
				boxWithFigures[i] = figure;
				System.out.println("Figure was plased in box on place " + i);
				break;
			} else if (i==boxWithFigures.length-1){
				System.out.println("There are no empty seats. Please, select another Box.");
				
			}
		}
	}
	
	public Figure getFigureByNumber(int number){
		if (number>n){
			System.out.println("Enter another number, please!");
		}
		return boxWithFigures[number];
				
	}
	
	public Figure takeFigure(int number){
		if (number>n || boxWithFigures[number]==null){
			System.out.println("There is no Figure");
			return null;
		} else {
			Figure figure = boxWithFigures[number];
			boxWithFigures[number] = null;
			return figure;
			
		}
		
	}
	
	public void changeFigure(int number, Figure figure){
		if (number>n){
			System.out.println("There is no Figure");
		} else boxWithFigures[number] = figure;
		
	}
	
	public int countOfFigures(){
		int count = 0;
		for (int i=0; i<=boxWithFigures.length-1; i++){
			if (boxWithFigures[i]!=null){
				count = count + 1;
			}
		}
		return count;
	}
	
	public float getFullPerimeter(){
		float fullPerim = 0;
		for (int i=0; i<=boxWithFigures.length-1; i++){
			if (boxWithFigures[i]!=null){
				fullPerim = fullPerim + boxWithFigures[i].getPerimeter();
			}
		}
		return fullPerim;
	}
	
	public float getFullArea(){
		float fullArea = 0;
		for (int i=0; i<=boxWithFigures.length-1; i++){
			if (boxWithFigures[i]!=null){
				fullArea = fullArea + boxWithFigures[i].getArea();
			}
		}
		return fullArea;
	}

}
