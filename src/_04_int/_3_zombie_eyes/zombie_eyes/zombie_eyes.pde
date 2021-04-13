PImage face;
void setup() {
  face = loadImage("smiley-face.png");
size(600,600);
face.resize(600,600);
}
void draw() {
image(face,0,0);
noStroke();
fill(mouseX,0,mouseY);
ellipse(220,215,55,120);
ellipse(373,215,55,120);
fill(0,0,0);
ellipse(220,215,10,10);
ellipse(373,215,10,10);
}
