package basic.factorypatten.Impl;

import basic.factorypatten.Shape;

/**
 * @author haipeng.wang
 * @version 1.0
 * @description: 三角形形状，实现shape接口
 * @date 2020/9/15 16:38
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("三角形中方的绘制方法");
    }
}
