package basic.factorypatten.Impl;

import basic.factorypatten.Shape;

/**
 * @author haipeng.wang
 * @version 1.0
 * @description: 实现形状接口的
 * @date 2020/9/15 16:45
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("圆形类的绘制方法");
    }
}
