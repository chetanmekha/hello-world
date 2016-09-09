package designpattern.factory;

/**
 * Created by ChetanM on 02-09-2016.
 */

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){

        if(choice == null)
            return  null;
        else if(choice.equalsIgnoreCase("ShapeFactory")){
            return new ShapeFact();
        }
        else if(choice.equalsIgnoreCase("ColorFactory")){
            return  new ColorFact();
        }
        return null;
    }
}
