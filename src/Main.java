import Classes.*;

public class Main {
    public static void main(String[] args) {
        Square square = new Square();   //standart adressation
        Circle circle = new Circle();   //standart adressation

        Shape polygon = new Polygon();  //polimorfizm
        Shape circle1 = new Circle();   //polimorfizm
        //Shape Notsquare = new Square();   //Doesn't work 'cause Square not extend Shape 

        System.out.println(square.render());
        System.out.println(circle.render());

        System.out.println(polygon.render());
        System.out.println(circle1.render());
    }
}