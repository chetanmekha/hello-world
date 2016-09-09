package designpattern.factory;

/**
 * Created by ChetanM on 02-09-2016.
 */

public abstract class AbstractFactory {

    abstract  Colors getColors(String colors);
    abstract  Shape getShape(String shape);
}
