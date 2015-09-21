import gpdraw.*;

public class Fractals {
   SketchPad pad;
   DrawingTool pen;
   public Fractals(){
       pad = new SketchPad(1920, 1080);
       pen = new DrawingTool(pad);
   }
   public void drawCurve(double angleToTurn, int level, double sideLength){
        if (level == 0){
            pen.move(sideLength);
        } else {
            drawCurve(-1 * angleToTurn, level - 1, sideLength / 2);
            pen.turnLeft(angleToTurn);
            drawCurve(angleToTurn, level - 1, sideLength / 2);
            pen.turnRight(angleToTurn);
            drawCurve(-1 * angleToTurn, level - 1, sideLength / 2);
        }
   } 
   public static void main(String[] args){
        Fractals ab = new Fractals();
        ab.drawCurve(60, 15, 500);
   }
}
