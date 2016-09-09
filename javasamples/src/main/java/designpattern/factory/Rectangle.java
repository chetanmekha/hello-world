package designpattern.factory;

/**
 * Created by ChetanM on 02-09-2016.
 */

public class Rectangle implements  Shape {
    @Override
    public void draw() {
        System.out.println("draw method called for Rectangle");
    }
}
