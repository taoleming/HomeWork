package day03;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 使用Date输出当前系统时间，以及3天后这一刻的时间
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        Date date = new Date();
        long time = date.getTime();
        long time1=time+3*24*60*60*1000;
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
        String str = sf.format(time1);
        String str1 = sf.format(time);
        System.out.println("系统当前时间："+str1);
        System.out.println("三天后的时间："+str);
    }
}
