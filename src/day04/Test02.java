package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 创建一个集合，存放元素"1","$","2","$","3","$","4"
 *   使用迭代器遍历集合，并在过程中删除所有的"$"，
 *   最后再将删除元素后的集合使用新循环遍历，并输出每一个元素。
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("1");
        coll.add("$");
        coll.add("2");
        coll.add("$");
        coll.add("3");
        coll.add("$");
        coll.add("4");
        Iterator<String>it = coll.iterator();
        while (it.hasNext()){
            String s = it.next();
            if("$".equals(s)){
                it.remove();
            }

        }
        System.out.println(coll);

    }
}
