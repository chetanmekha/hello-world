package designpattern.factory;

/**
 * Created by ChetanM on 02-09-2016.
 * Class used for returing object with respect to string type
 */

public class ShapeFactory {

   public Shape getShape(String strType){
       if(strType == null)
           return null;
       else if (strType.equalsIgnoreCase("CIRCLE"))
           return new Circle();
       else if(strType.equalsIgnoreCase("RECTANGLE"))
           return  new Rectangle();
       return null;
   }
}
