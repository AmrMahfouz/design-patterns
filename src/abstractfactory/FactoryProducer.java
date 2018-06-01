package abstractfactory;

import abstractfactory.colors.ColorFactory;
import abstractfactory.shapes.ShapeFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(FactoryType factoryType) {
        switch (factoryType) {
            case COLOR:
                return new ColorFactory();
            case SHAPE:
                return new ShapeFactory();
        }
        return null;
    }

}
