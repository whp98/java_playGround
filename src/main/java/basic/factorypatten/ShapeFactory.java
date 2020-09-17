package basic.factorypatten;

import basic.factorypatten.Impl.Circle;
import basic.factorypatten.Impl.Rectangle;
import basic.factorypatten.Impl.Square;

/**
 * @author haipeng.wang
 * @version 1.0
 * @description 形状工厂
 * @date 2020/9/15 16:48
 */
public class ShapeFactory {
    public Shape getShape(String shapeType){
        if (shapeType == null){
            return null;
        }
        if("CIRCLE".equalsIgnoreCase(shapeType)){
            return new Circle();
        }else if ("RECTANGLE".equalsIgnoreCase(shapeType)){
            return new Rectangle();
        }else if ("SQUARE".equalsIgnoreCase(shapeType)){
            return new Square();
        }
        return null;
    }
}
