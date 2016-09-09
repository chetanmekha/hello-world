package designpattern.factory;

/**
 * Created by ChetanM on 02-09-2016.
 */

public class AbstractFactoryPatternDemo {

    public static void main(String args[]){
        AbstractFactory abstractFactory = FactoryProducer.getFactory("ShapeFactory");
        Shape shape = abstractFactory.getShape("Circle");
        shape.draw();

        AbstractFactory abstractFactoryColors = FactoryProducer.getFactory("ColorFactory");
        Colors colors = abstractFactoryColors.getColors("Red");
        colors.fillColors();

        shape = abstractFactory.getShape("Rectangle");
        shape.draw();

        colors = abstractFactoryColors.getColors("Blue");
        colors.fillColors();

    }
}
