package decorator;

public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("Circle with normal Border");
        circle.draw();

        Shape redCircle = new RedShapeDecorator(new Circle());
        System.out.println("Circle with red Border");
        redCircle.draw();

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Rectangle with red Border");
        redRectangle.draw();

    }

}
