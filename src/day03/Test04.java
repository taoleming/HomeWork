package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**2018-03-25
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 * @author Bonnie
 * 
 */
public class Test04 {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        System.out.println("输入生产日期：");
        String str = console.next();
        System.out.println("保质期天数：");
        int a = console.nextInt();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sf.parse(str);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE,a);
        cal.add(Calendar.WEEK_OF_MONTH,-2);
        cal.add(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);
        Date date1 = cal.getTime();
        System.out.println(date1);
    }
	
}
