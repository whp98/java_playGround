package basic;

/**
 * @author haipeng.wang
 * @version 1.0
 * @description: 测试Double的精度
 * @date 2020/8/13 9:51
 */
public class DoubleDemo {
    Double a;
    Double b;
    Double c;
    DoubleDemo(){
        a = Double.valueOf("1.0");
        b = Double.valueOf("0.9");
        c = Double.valueOf("0.8");
    }

    public Double getASubtractionB() {
        return a-b;
    }

    public Double getBSubtractionC() {
        return b-c;
    }
}
