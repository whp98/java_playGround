/**
 * @author haipeng.wang
 * @version 1.0
 * @description: 数据导出格式
 * @date 2020/10/21 15:49
 */

import java.util.*;
import java.text.*;

public class Test1 {

        static public void customFormat(String pattern, double value) {
            DecimalFormat myFormatter = new DecimalFormat(pattern);
            String output = myFormatter.format(value);
            System.out.println(value + "  " + pattern + "  " + output);
        }

        static public void localizedFormat(String pattern, double value, Locale loc) {
            NumberFormat nf = NumberFormat.getNumberInstance(loc);
            DecimalFormat df = (DecimalFormat) nf;
            df.applyPattern(pattern);
            String output = df.format(value);
            System.out.println(pattern + "  " + output + "  " + loc.toString());
        }

         public static void main(String[] args) {

            customFormat("###,###.###", -123456.789);
            customFormat("#,##0.0000", -14234234.789);
            customFormat("###.##", 123456.789);
            customFormat("000000.000", 123.78);
            customFormat("$###,###.###", 12345.67);
            customFormat("\u00a5###,###.###", 12345.67);

            Locale currentLocale = new Locale("en", "US");

            DecimalFormatSymbols unusualSymbols = new DecimalFormatSymbols(currentLocale);
            unusualSymbols.setDecimalSeparator('|');
            unusualSymbols.setGroupingSeparator('^');
            String strange = "#,##0.###";
            DecimalFormat weirdFormatter = new DecimalFormat(strange, unusualSymbols);
            weirdFormatter.setGroupingSize(4);
            String bizarre = weirdFormatter.format(12345.678);
            System.out.println(bizarre);

            Locale[] locales = {
                    new Locale("en", "US"),
                    new Locale("de", "DE"),
                    new Locale("fr", "FR")
            };

            for (int i = 0; i < locales.length; i++) {
                localizedFormat("###,###.###", 123456.789, locales[i]);
            }
        }
}
