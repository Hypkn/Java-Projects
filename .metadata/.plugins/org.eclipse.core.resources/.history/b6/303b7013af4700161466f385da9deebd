package guimodule;

import processing.core.PApplet;
import processing.core.PImage;

public class ChangingSun extends PApplet{
	
	PImage img;
	
	public void setup(){
		size(400, 400);
		background(255);
		stroke(0);  //set pen color
		img = loadImage("http://cseweb.ucsd.edu/~minnes/palmTrees.jpg", "jpg");
		img.resize(0, height);   //resize loaded image to full height of canvas
		image(img, 0, 0); //display image		
	}
	
	
	public void draw(){
		//Add drawing code
		int[] color = sunColorSec(second());
		fill(color[0], color[1], color[2]);
		ellipse(width/4, height/5, width/4, height/5);
		
		
	}
	
	public int[] sunColorSec(float seconds){
		
		int[] rgb = new int [3];
		
		float diffFrom30 = Math.abs(30-seconds);
		
		float ratio = diffFrom30/30;
		
		rgb[0] = (int)(255 * ratio);
		rgb[1] = (int)(255 * ratio);
		rgb[2] = 0;
		
		System.out.println("Red" + rgb[0] + "G" + rgb[1] + "Blue" + rgb[2]);
		
		return rgb;
		
		
		
		
		
	}

}
