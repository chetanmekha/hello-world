package designpattern.factory;

/**
 * Created by ChetanM on 02-09-2016.
 */

public class Blue implements  Colors {
    @Override
    public void fillColors() {
        System.out.println("Inside blue :: fillColors method");
    }
}
