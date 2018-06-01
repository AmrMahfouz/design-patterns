package abstractfactory;

import abstractfactory.colors.Color;
import abstractfactory.colors.ColorType;
import abstractfactory.shapes.Shape;
import abstractfactory.shapes.ShapeType;

public abstract class AbstractFactory {

    public abstract Shape getShape(ShapeType shapeType);

    public abstract Color getColor(ColorType colorType);

}
