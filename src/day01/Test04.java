package day01;

import java.util.Scanner;

/**
 * 要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
 * @author Bonnie
 *
 */
public class Test04 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("输入Email格式：");
		String str = console.next();
		int index = str.indexOf("@");
		String s = str.substring(0,index);
		System.out.println("获取该email的用户名(@之前的内容):"+s);

	}
}
