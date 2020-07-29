package day03;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个集合，存放字符串"one","two"，"three"
 * 然后输出该集合的元素个数。
 * 然后输出该集合是否包含字符串"four"
 * 然后输出集合是否不含有任何元素
 * 然后清空集合
 * 然后输出该集合的元素个数
 * 然后输出集合是否不含有任何元素
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        int a = list.size();
        boolean b = list.contains("four");
        boolean c = list.isEmpty();
        list.clear();
        int d = list.size();
        boolean e = list.isEmpty();
        System.out.println("集合元素个数："+a);
        System.out.println("是否包含字符'four':"+b);
        System.out.println("是否不含任何元素："+c);
        System.out.println("清空后的元素个数："+d);
        System.out.println("清空后是否不含任何元素："+e);

    }

}
