package day02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 输入一个IP地址，然后将4段数字分别输出
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("输入一个IP地址：");
        String str = console.nextLine();
        String[] strAll = str.split("\\.");
        for(String s:strAll){
            System.out.println(s);
        }
    }
}
