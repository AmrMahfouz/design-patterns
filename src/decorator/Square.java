package decorator;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("From Square Draw Method");
    }
}