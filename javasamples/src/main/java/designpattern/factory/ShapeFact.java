package designpattern.factory;

/**
 * Created by ChetanM on 02-09-2016.
 */

public class ShapeFact extends AbstractFactory {
    @Override
    Colors getColors(String colors) {
        return null;
    }

    @Override
    Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }

        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        }
        return null;
    }
}
