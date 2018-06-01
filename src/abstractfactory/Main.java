package abstractfactory;

import abstractfactory.colors.ColorType;
import abstractfactory.shapes.ShapeType;

public class Main {

    public static void main(String[] args) {
        AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryType.COLOR);
        colorFactory.getColor(ColorType.RED).fill();
        colorFactory.getColor(ColorType.GREEN).fill();
        colorFactory.getColor(ColorType.BLUE).fill();
        AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryType.SHAPE);
        shapeFactory.getShape(ShapeType.CIRCLE).draw();
        shapeFactory.getShape(ShapeType.RECTANGLE).draw();
        shapeFactory.getShape(ShapeType.SQUARE).draw();
    }

}
