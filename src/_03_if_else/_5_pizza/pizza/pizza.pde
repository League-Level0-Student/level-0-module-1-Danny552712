PImage pepperoni;
PImage mushroom;
PImage olive;
void setup() {
    size(500,500);
    pepperoni =loadImage("pepperoni.png");
    image(pepperoni,150,150);
    mushroom=loadImage("mushroom.png");
    image(mushroom,150,150);
    olive=loadImage("olive.png");
    image(olive,100,100);
}
void draw() {
  noStroke(); 
  fill(#F2AE1B);
  ellipse(250,250,200,200);
  fill(#CE0202);
  ellipse(250,250,185,185);
  fill(#FCEA3B);
  ellipse(250,250,180,180);
  pepperoni.resize(10,10);
}
