package abstractfactory.colors;

import abstractfactory.AbstractFactory;
import abstractfactory.shapes.Shape;
import abstractfactory.shapes.ShapeType;

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(ShapeType shapeType) {
        return null;
    }

    @Override
    public Color getColor(ColorType colorType) {
        switch (colorType) {
            case RED:
                return new Red();
            case BLUE:
                return new Blue();
            case GREEN:
                return new Green();
        }
        return null;
    }

}
