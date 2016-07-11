package guimodule;

import processing.core.PApplet;

public class MyDisplay extends PApplet {
	
	public void setup(){
		
		size(400, 400);
		background(200 ,200 , 200);

	}
	
	public void draw() {
		//Face
		fill(240,255,51);
		ellipse(200, 200, 390, 390);
		
		//Eyes
		fill(0, 0, 0);
		ellipse(120, 130, 50, 70);
		fill(0,0,0);
		ellipse(280, 130, 50, 70);
		
		//Mouth
		noFill();
		arc(200, 280, 75, 75,0 , PI);
		
		
		
	}
	

}
