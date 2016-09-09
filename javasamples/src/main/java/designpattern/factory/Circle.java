package designpattern.factory;

/**
 * Created by ChetanM on 02-09-2016.
 */

public class Circle  implements  Shape {
    @Override
    public void draw() {
        System.out.println("draw method called for Circle");
    }

    public void drawCircle(){
        System.out.println("Method declaration inside Circle class");
    }
}
