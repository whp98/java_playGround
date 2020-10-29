package basic;

import org.junit.Test;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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
    @Test
    public void hahaTest(){
        System.out.println(System.getProperty("java.io.tmpdir"));
    }
    @Test
    public void bigdecTest(){
        BigDecimal bigDecimal  = new BigDecimal("0.000001");
        System.out.println(bigDecimal.abs().compareTo(new BigDecimal("0.0000000000001")));
    }
    @Test
    public void getCurrentMonthDay() {
        Calendar a = Calendar.getInstance();
        a.setTime(new Date("2019-01-10"));
        a.set(Calendar.DATE, 1);
        a.roll(Calendar.DATE, -1);
        int maxDate = a.get(Calendar.DATE);
        System.out.println(maxDate);
    }

//    @Test
//    public void getTimeOneMonthAgo(){
//        String strTime= "2020-10-27";
//        SimpleDateFormat sdf  = new SimpleDateFormat("yyyy-MM-dd");
//        String minDateStr = "";
//        Calendar calc =Calendar.getInstance();
//        try {
//            calc.setTime(sdf.parse(strTime));
//            calc.add(Calendar.DATE, -getCurrentMonthDay());
//            Date minDate = calc.getTime();
//            minDateStr = sdf.format(minDate);
//            System.out.println(minDateStr);
//        } catch (ParseException e1) {
//            e1.printStackTrace();
//            System.out.println(strTime);
//        }
//    }
}
