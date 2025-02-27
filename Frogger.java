Frog frog;

float grid = 50;

void setup() {
    size(500, 500);
frog = new Frog(width/2-grid/2, height-grid, grid );

}

void draw(){

   bacgraound(0);
    frog.show();
}

void keypressed(){
    if(keyCode == UP){
        frog.move(0.-1);
} else if (keyCode == DOWN){
frog.move(0,1);
} else if (keyCode== LEFT){
   frog.move(-1,0);
} else if (keyCode == RIGHT){
frog.move(1,0);
}   
}
