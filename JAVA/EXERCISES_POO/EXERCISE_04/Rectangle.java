
public class Rectangle  extends  Figure{
    private double height ;
    private double width ;
 
     public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
     }
 
     @Override
     public double calcularArea(){
        return this.width * this.height;
     }
 }