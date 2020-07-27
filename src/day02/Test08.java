package day02;

import java.util.Scanner;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary;name,age,gender,salary;....
 * 例如:
 * 张三,25,男,5000;李四,26,女,6000;...
 * 然后将每个员工信息解析成Person对象。并存入到一个数组中。
 * 然后循环数组，输出每一个员工信息(输出使用toString返回的字符串)
 * @author Bonnie
 *
 */
public class Test08 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("输入员工信息！");
        String str = console.nextLine();
        String[] s = str.split(";");
        Person[] peoArr = new Person[s.length];

        for(int i=0;i<peoArr.length;i++){
            String people = s[i];
            String[] date = people.split(",");
            String name = date[0];
            int age = Integer.parseInt(date[1]);
            String gender = date[2];
            int salary = Integer.parseInt(date[3]);
            Person p = new Person(name,age,gender,salary);
            peoArr[i] = p;
        }
        for(int i=0;i<peoArr.length;i++){
            System.out.println(peoArr[i]);
        }
    }
}
