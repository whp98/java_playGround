package constructor;

/**
 * @author haipeng.wang
 * @version 1.0
 * @description: 父类
 * @date 2020/8/11 15:03
 */
public class Father {
    private String name;

    Father(String name) {
        this.name = name;
    }

    Father() {
        this.name = "hahah";
    }

    public String getName() {
        return name;
    }
}
