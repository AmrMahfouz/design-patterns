package prototype;

public class Main {

    public static void main(String[] args) {
        ShapeCache shapeCache = new ShapeCache();
        shapeCache.loadCache();
        Shape shape1 = shapeCache.getShape("1");
        System.out.println("Shape : " + shape1.getType());
        shape1.draw();
        Shape shape2 = shapeCache.getShape("2");
        System.out.println("Shape : " + shape2.getType());
        shape2.draw();
        Shape shape3 = shapeCache.getShape("3");
        System.out.println("Shape : " + shape3.getType());
        shape3.draw();
    }

}
