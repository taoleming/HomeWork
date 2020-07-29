package day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 通过控制台输入3个日期(yyyy-MM-dd格式)，然后转换为Date对象后存入
 * 集合，然后对该集合排序后输出所有日期。
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) throws ParseException {
        List<Date>list = new ArrayList<>();
        Scanner console = new Scanner(System.in);
        System.out.println("输入3个日期(yyyy-MM-dd格式)：");
        for (int i = 0; i <3 ; i++) {
            String str = console.nextLine();
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sf.parse(str);
            list.add(date);
        }
        Collections.sort(list, new Comparator<Date>() {
            @Override
            public int compare(Date o1, Date o2) {
                return o1.getDay()-o2.getDay();
            }
        });
        System.out.println(list);
    }
}
