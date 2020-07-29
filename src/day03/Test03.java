package day03;

import javax.xml.crypto.Data;
import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Date data = sf.parse(str);
        Date date = new Date(String.valueOf(data));
        long time = date.getTime();
       Date date1 = new Date();
       long time1 = date1.getTime();
       long s = (time1-time)/(7*24*60*60*1000);
        System.out.println(s+1);
    }
}
