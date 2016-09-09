package designpattern.factory;

/**
 * Created by ChetanM on 02-09-2016.
 */

public class ColorFact extends AbstractFactory {
    @Override
    Colors getColors(String color) {
        if(color == null){
            return null;
        }

        if(color.equalsIgnoreCase("RED")){
            return new Red();

        }else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }

        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
