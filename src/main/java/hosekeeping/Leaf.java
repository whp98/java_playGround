package hosekeeping;

/**
 * @author haipeng.wang
 * @version 1.0
 * @description: 这里的使用方式很像之前看过的一些多级调用的语法实现，即可以连续调用很多次方法。
 * @date 2020/10/30 16:17
 */
public class Leaf {
    int i = 0;

    Leaf increment() {
        i++;
        return this;
    }

    Leaf decrease() {
        i--;
        return this;
    }

    void print() {
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        Leaf x = new Leaf();
        x.increment().increment().increment().decrease().decrease().increment().print();
    }
}
