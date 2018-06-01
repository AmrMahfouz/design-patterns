package abstractfactory.shapes;

import abstractfactory.AbstractFactory;
import abstractfactory.colors.Color;
import abstractfactory.colors.ColorType;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case CIRCLE:
                return new Circle();
            case SQUARE:
                return new Square();
            case RECTANGLE:
                return new Rectangle();
        }
        return null;
    }

    @Override
    public Color getColor(ColorType colorType) {
        return null;
    }
}
