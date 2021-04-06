PImage pepperoni;
PImage mushroom;
PImage olive;
void setup() {
    size(500,500);
    pepperoni =loadImage("pepperoni.png");
    mushroom=loadImage("mushroom.png");
    olive=loadImage("olive.png");
}
void draw() {
  noStroke(); 
  fill(#F2AE1B);
  ellipse(250,250,200,200);
  fill(#CE0202);
  ellipse(250,250,185,185);
  fill(#FCEA3B);
  ellipse(250,250,180,180);
  image(pepperoni,200,200);
  pepperoni.resize(30,30);
  image(mushroom,250,250);
  mushroom.resize(30,30);
  image(olive,200,250);
  olive.resize(30,30);
  image(pepperoni,275,300);
  pepperoni.resize(30,30);
  image(mushroom,300,300);
  mushroom.resize(30,30);
  image(olive,275,275);
  olive.resize(30,30);
}
