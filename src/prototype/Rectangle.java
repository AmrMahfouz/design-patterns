package prototype;

public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("From Rectangle Draw Method");
    }
}
