package Demo09API;

import java.util.ArrayList;

/*
数组的长度不可以发生改变，
但是ArrayList集合的长度是可以随意变化的
对于ArrayList来说，有一个尖括号代表泛型 ，泛型就是装在集合中的所有元素，
 */
public class Demo09ArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        System.out.println(list);
        list.add("赵丽颖");
        System.out.println(list);
        list.add("张三");
        list.add("李四");
        System.out.println(list);
    }
}
