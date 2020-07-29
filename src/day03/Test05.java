package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日
 * 所在周的周三的日期。
 * 例如:
 * 出生日期:1992-07-15。
 * 20岁生日:2012-07-15
 * 当周的周三为:2012-07-18
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        String id = "";
        String str = "\\d{18}";
        while (true){
            System.out.println("输入身份证号：");
            id = console.nextLine();
            if(!id.matches(str)){
                System.out.println("请输入正确的身份证号:");
            }else {
                break;
            }
        }
        String s = id.substring(6,14);
        SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");
        Date date = sf.parse(s);
        SimpleDateFormat sf1 = new SimpleDateFormat("yyyy-MM-dd");
        String f1 = sf1.format(date);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.YEAR,20);
        Date date1 = cal.getTime();
        String f2 = sf1.format(date1);
       cal.set(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);
       Date date2 = cal.getTime();
       String f3 = sf1.format(date2);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
    }
}
