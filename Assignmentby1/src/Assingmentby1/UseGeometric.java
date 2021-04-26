package Assingmentby1;

public class UseGeometric {
    public static void main(String[] args)
    {
        Square square = new Square(6,6, "Square");
        System.out.println(square.toString());
        Triangle triangle = new Triangle(7,5, "Triangle");
        System.out.println(triangle.toString());
        Square square1 = new Square(12,12, "Square");
        System.out.println(square1.toString());
        Triangle triangle1 = new Triangle(10,9, "Triangle");
        System.out.println(triangle1.toString());
    }
}
