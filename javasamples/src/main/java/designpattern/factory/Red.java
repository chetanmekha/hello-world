package designpattern.factory;

/**
 * Created by ChetanM on 02-09-2016.
 */

public class Red implements  Colors {
    @Override
    public void fillColors() {
        System.out.println("Inside red :: fillColors Method");
    }
}
