package basic.factorypatten;
import org.junit.Test;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import static org.junit.Assert.*;
public class ShapeFactoryTest{
    @Test
    public void shapeTest(){
        long times = System.nanoTime();
        long timemimi = System.currentTimeMillis();
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
        System.out.println(System.nanoTime()-times);
        System.out.println(System.currentTimeMillis()-timemimi);
        System.out.println(LocalDate.now().lengthOfYear());
        System.out.println(LocalDate.now().lengthOfMonth());
    }
    //PAC: 遍历删除使用iterator来进行
    @Test
    public void foreachTest(){
        List<String> list = new ArrayList<>();
        list.add("2");
        list.add("2");
        Iterator<String> iterator = list.listIterator();
        while(iterator.hasNext()){
            String item = (String) iterator.next();
            if("2".equals(item)){
                iterator.remove();
            }
        }
        System.out.println(list);
    }
    //P3C注意map是否允许存入null值
    @Test
    public void mapSaveNullTest(){
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("hello",null);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("sdhajd",null);
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        //报错
        //concurrentHashMap.put("sdhakjdh", null);
        Hashtable<String, String> hashtable = new Hashtable<>();
        //NPE
        //hashtable.put("dshakjdjas",null);
    }
}