package day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 将"大家好!"修改为:"大家好!我是程序员!"并输出。
 * 然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
 * 然后再修改为:"大家好!我是牛牛的程序员!"并输出
 * 然后在修改为:"我是牛牛的程序员!"并输出
 * @author Bonnie
 * 使用StringBuilder完成
 */
public class Test02 {
	public static void main(String[] args) {
		String s = "大家好!";
		String s2 ="我是程序员!";
		String s3 = "优秀的";
		String s4 = "牛牛的";
		String str  = s.concat(s2);
		String str2 = str.substring(0,6)+s3+str.substring(6);
		String str3 = str2.replace(s3,s4);
		String str4 = str3.substring(4);
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(84);
		System.out.println(44);
		System.out.println(9);
	}
}
