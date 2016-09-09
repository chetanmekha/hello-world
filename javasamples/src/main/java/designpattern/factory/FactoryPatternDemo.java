package designpattern.factory;

/**
 * Created by ChetanM on 02-09-2016.
 */

public class FactoryPatternDemo {
    public static void main(String args[]){
        ShapeFactory shapeFactory = new ShapeFactory();

        // Circle object
        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.draw();
        // Rectangle object
        shape1 = shapeFactory.getShape("Rectangle");
        shape1.draw();
    }
}
