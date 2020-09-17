package basic.factorypatten;

import org.junit.Test;

import static org.junit.Assert.*;
public class ShapeFactoryTest{
    @Test
    public void shapeTest(){
        ShapeFactory shapeFactory = new ShapeFactory();
        //获取Circle对象并调用draw方法
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        assertNotNull(shape1);
        shape1.draw();
        //获取Rectangle对象并调用其draw方法
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        assertNotNull(shape2);
        shape2.draw();
        //获取Square对象并调用其draw方法
        Shape shape3 = shapeFactory.getShape("SQUARE");
        assertNotNull(shape3);
        shape3.draw();
    }
}