package abstractfactory.shapes;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("From Rectangle Draw Method");
    }
}
