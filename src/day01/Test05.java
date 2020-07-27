package day01;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

/**
 * 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 * @author Bonnie
 *
 */
public class Test05 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String[] str2 = new String[5];
		String str3 ="";
		int str=0;
		char str1=0;

		for(int i=0;i<str2.length;i++){
			Random random = new Random();
			str = random.nextInt(58)+65;
			str1=(char)str;
			if(str>=65&&str<=90||str>=97&&str<=122){
				str3=str1+str3;
			}else {
				i--;
			}
		}

		System.out.println("验证码是："+str3.toString());
		System.out.println("输入验证码：");
		String s =console.next();
		boolean b = s.equalsIgnoreCase(str3);
		if(b==true){
			System.out.println("正确");
		}else {
			System.out.println("错误");
		}
	}
}
