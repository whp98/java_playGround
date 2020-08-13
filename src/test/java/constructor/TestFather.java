package constructor;

import org.junit.Test;

/**
 * @author haipeng.wang
 * @version 1.0
 * @description: 测试Father类
 * @date 2020/8/11 12:25
 */
public class TestFather {
    /**
     * 测试一
     */
    @Test
    public void testFather(){
        Father father = new Father("sjdahj");
        assert(father.getName().equals("sjdahj"));
    }

    /**
     * 测试二
     */
    @Test
    public void testFatherWithNoArg(){
        Father father = new Father();
        assert(father.getName().equals("hahah"));
    }
}

