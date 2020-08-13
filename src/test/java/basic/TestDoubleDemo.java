package basic;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * @author haipeng.wang
 * @version 1.0
 * @description: 测试Double类的方法
 * @date 2020/8/13 10:00
 */
public class TestDoubleDemo {


    @Test
    public void testDoubleIsEqual(){
        DoubleDemo doubleDemo = new DoubleDemo();
        //assert (Objects.equals(doubleDemo.getASubtractionB(), doubleDemo.getBSubtractionC()));
        BigDecimal bigDecimal = new BigDecimal("299342432");
        bigDecimal.equals(bigDecimal);
    }

}
