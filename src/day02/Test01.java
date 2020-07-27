package day02;

import java.util.Scanner;

/**
 * 要求用户输入一个字符串，然后若该字符串是一个整数，则转换为整数后输出乘以10后的结果
 * 若是小数，则转换为一个小数后输出乘以5后的结果，若不是数字则输出"不是数字"
 * 需要使用正则表达式进行判断。
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();

        String s1 = "\\d+";
        String s2 = "\\d+\\.+\\d+";
        String s3 = "[^\\d]+";

        if(str.matches(s1)){
            Integer num =Integer.parseInt(str);
            num*=10;
            System.out.println("是整数："+num);
        }
        if(str.matches(s2)){
            Double num = Double.parseDouble(str);
            num*=5;
            System.out.println("是小数："+num);
        }
        if(str.matches(s3)){
            System.out.println("不是数字！");
        }

    }

}
