package basic.factorypatten.Impl;

import basic.factorypatten.Shape;

/**
 * @author haipeng.wang
 * @version 1.0
 * @description: 实现形状接口的正方形类
 * @date 2020/9/15 16:40
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("正方形的绘制方法");
    }
}
