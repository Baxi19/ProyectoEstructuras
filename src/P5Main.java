/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
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
float segLength = 100;//tamaño del brazo
float targetX, targetY;

    
boolean recording = false;

float theta;   


ArrayList<ParticleSystem> systems;
public void settings() {
  size(800, 800);
}

public void setup() {
  
    systems = new ArrayList<ParticleSystem>();
    
    // Cargamos las imagenes en variables
    botonSinPulsar = loadImage("game2.png");
    botonPulsado = loadImage("game.png");
}
    PImage botonSinPulsar; 
    PImage botonPulsado;
public void draw() {
    background(0);
  // Ponemos el boton
  image(botonSinPulsar, 144, 86);
  
  // si se pulsa el boton cambiamos la imagen
  // la imagen mide 111x28, tenemos esto en cuenta
  if(mousePressed)
   if(mouseX > 144 && mouseX < 255)
     if (mouseY > 86 && mouseY < 114)
     {
       image(botonPulsado, 144, 86);
       // Aqui tambien pondriamos el codigo 
       // que dispare la accion del boton
       WindowLogin w = new WindowLogin();
       w.setVisible(true);
     }
    
    //background(0);
    
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
 /*---------------------------------------------------------------*/   
 //background(0);
  for (ParticleSystem ps : systems) {
    ps.run();
    ps.addParticle();
  }
  
}

public void mousePressed() {
  systems.add(new ParticleSystem(1, new PVector(mouseX, mouseY)));
}


// An ArrayList is used to manage the list of Particles

class ParticleSystem {

  ArrayList<Particle> particles;    // An arraylist for all the particles
  PVector origin;                   // An origin point for where particles are birthed

  ParticleSystem(int num, PVector v) {
    particles = new ArrayList<Particle>();   // Initialize the arraylist
    origin = v.copy();                        // Store the origin point
    for (int i = 0; i < num; i++) {
      particles.add(new Particle(origin));    // Add "num" amount of particles to the arraylist
    }
  }


  void run() {
    // Cycle through the ArrayList backwards, because we are deleting while iterating
    for (int i = particles.size()-1; i >= 0; i--) {
      Particle p = particles.get(i);
      p.run();
      if (p.isDead()) {
        particles.remove(i);
      }
    }
  }

public  void addParticle() {
    Particle p;
    // Add either a Particle or CrazyParticle to the system
    //array[position] = (int) (Math.random()*range+1);
    if ((int) (Math.random()*2+0) == 0) {
      p = new Particle(origin);
    } 
    else {
      p = new CrazyParticle(origin);
    }
    particles.add(p);
  }

  void addParticle(Particle p) {
    particles.add(p);
  }

  // A method to test if the particle system still has particles
  boolean dead() {
    return particles.isEmpty();
  }
}



// A subclass of Particle

class CrazyParticle extends Particle {

  // Just adding one new variable to a CrazyParticle
  // It inherits all other fields from "Particle", and we don't have to retype them!
  float theta;

  // The CrazyParticle constructor can call the parent class (super class) constructor
  CrazyParticle(PVector l) {
    // "super" means do everything from the constructor in Particle
    super(l);
    // One more line of code to deal with the new variable, theta
    theta = (float) 0.0;
  }

  // Notice we don't have the method run() here; it is inherited from Particle

  // This update() method overrides the parent class update() method
 public void update() {
    super.update();
    // Increment rotation based on horizontal velocity
    float theta_vel = (velocity.x * velocity.mag()) / 10.0f;
    theta += theta_vel;
  }

  // This display() method overrides the parent class display() method
 public void display() {
    // Render the ellipse just like in a regular particle
    super.display();
    // Then add a rotating line
    pushMatrix();
    translate(position.x, position.y);
    rotate(theta);
    stroke(125, lifespan);
    line(0, 0, 25, 0);
    popMatrix();
  }
}


// A simple Particle class

class Particle {
  PVector position;
  PVector velocity;
  PVector acceleration;
  float lifespan;

  Particle(PVector l) {
    acceleration = new PVector(0, (float) 0.05);
    velocity = new PVector(random(-1, 1), random(-2, 0));
    position = l.copy();
    lifespan = (float) 255.0;
  }

  void run() {
    update();
    display();
  }

  // Method to update position
  void update() {
    velocity.add(acceleration);
    position.add(velocity);
    lifespan -= 2.0;
  }

  // Method to display
  void display() {
    stroke(255, lifespan);
    fill(255, lifespan);
    ellipse(position.x, position.y, 8, 8);
  }

  // Is the particle still useful?
  boolean isDead() {
    return (lifespan < 0.0);
  }
}

/*
button example


public void draw()
{
  // Pintamos un fondo negro
  background(0);
  
  // Ponemos el boton
  image(botonSinPulsar, 144, 86);
  
  // si se pulsa el boton cambiamos la imagen
  // la imagen mide 111x28, tenemos esto en cuenta
  if(mousePressed)
   if(mouseX > 144 && mouseX < 255)
     if (mouseY > 86 && mouseY < 114)
     {
       image(botonPulsado, 144, 86);
       // Aqui tambien pondriamos el codigo 
       // que dispare la accion del boton
       WindowLogin w = new WindowLogin();
       w.setVisible(true);
     }
}*/    
//HASTA AQUI


    
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
      
    new WindowLogin().setVisible(true);
    }
  }
}
