package Assingmentby1;
public class Triangle extends GeometricFigure {
    Triangle(int height, int width, String type){
        super(height, width, type);
    }

   
    public double getArea() {
        return (super.getHeight() * super.getWidth())/2;
    }

        public String toString() {
        return "The " + super.getType() + "  height = " + super.getHeight() + " and width = " + super.getWidth() + " has an area of " + this.getArea();
    }
}
