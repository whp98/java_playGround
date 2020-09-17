package bullshitCode;

import java.util.Scanner;

/**
 * @author haipeng.wang
 * @version 1.0
 * @description: 一段客服垃圾代码
 * @date 2020/9/15 8:59
 */
public class codeRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        // 待优化
        while (true) {
            str = sc.next();
            // 测试环境，正式环境从数据库中获取
            str = str.replace("吗", "");
            str = str.replace("？", "！");
            str = str.replace("？", "！");
            str = str.replace("不", "很");
            str = str.replace("你们", "我们");
            str = str.replace("有", "没有");

            System.out.println(str);
        }
    }
}
