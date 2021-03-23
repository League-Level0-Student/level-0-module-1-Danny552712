int x = 140;
int y = 196;

void setup() {
    size(500, 500);
}
void draw() {
    background(200, 200, 200);
    noStroke();
    fill(#FF0505);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#04B422);
    rect(176, 103, 12, 32);
    fill(#000000);
    ellipse(160,180,10,10);
    ellipse(200,180,10,10);
    if(mousePressed){
      fill(#FFFFFF);
      rect(x,y,80,40);
    }
}
 void mousePressed (){  
//  x+=20;
 }
