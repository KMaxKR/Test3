import Classes.*;

public class Main {
    public static void main(String[] args) {
        Square square = new Square();   //standart adressation
        Circle circle = new Circle();   //standart adressation

        Shape polygon = new Polygon();  //polimorfizm
        Shape circle1 = new Circle();   //polimorfizm
        Shape square1 = new Square();

        System.out.println(square.render());
        System.out.println(circle.render());

        System.out.println(polygon.render());
        System.out.println(circle1.render());
        System.out.println(square1.render());
    }
}