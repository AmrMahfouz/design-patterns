package bridge;

public class Main {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        redCircle.draw();

        Shape greenCircle = new Circle(1000, 1000, 100, new RedCircle());
        greenCircle.draw();
    }

}
