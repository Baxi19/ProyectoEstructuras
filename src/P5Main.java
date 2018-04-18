/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import processing.core.*;

/**
*
* @author Randald
*/
@SuppressWarnings("serial")
public class P5Main extends PApplet{
    
    
int numSegments = 8;//numero de segmentos
float[] x = new float[numSegments];
float[] y = new float[numSegments];
float[] angle = new float[numSegments];
float segLength = 60;//tamaño del brazo
float targetX, targetY;

    
boolean recording = false;

float theta;   

public void settings() {
  size(600, 600);
}


public void draw() {
  background(0);
  
  // An arbitrary oscillating rotating animation 
  // so that we have something to render
  for (float a = 0; a < TWO_PI; a+= 0.2) {
    pushMatrix();
    translate(width/2, height/2);
    rotate(a+sin((float) (frameCount*0.004*a)));
    stroke(255);
    line(-100, 0, 100, 0);
    popMatrix();
  }
  
  // If we are recording call saveFrame!
  // The number signs (#) indicate to Processing to 
  // number the files automatically
  if (recording) {
    saveFrame("output/frames####.png");
  }
   
  // Let's draw some stuff to tell us what is happening
  // It's important to note that none of this will show up in the
  // rendered files b/c it is drawn *after* saveFrame()
  textAlign(CENTER);
  fill(255);
  if (!recording) {
    text("You Win.....", width/2, height-24);
  } 
  else {
    text("You Win......", width/2, height-24);
  }
  
  // A red dot for when we are recording
  stroke(255);
  if (recording) {
    fill(255, 0, 0);
  } else { 
    noFill();
  }
  ellipse(width/2, height-48, 16, 16);
}
/*
/**
 * @param passedArgs the command line arguments
 */
static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] {P5Main.class.getName()};
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
      //new WindowLogin().setVisible(true);
    }
  }
}
