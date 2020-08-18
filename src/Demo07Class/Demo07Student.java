package Demo07Class;
/*
通常情况下，一个类并不能直接使用，需要根据类创建一个对象才能使用
1，导包，也就是指出需要使用的类，在什么位置
import 包名称.类名称
对于和当前类属于同一个包的情况，可以省略导包语句
2，创建，格式
类名称  对象名 = new 类名称（）；
Student stu = new Student（）；
3，使用，分为两种情况
使用成员变量：对象名.成员变量名
使用成员方法：对象名.成员方法名（参数）
 */
public class Demo07Student {
    public static void main(String[] args) {
        Student stu = new Student();
        System.out.println(stu.name);
        System.out.println(stu.age);
        stu.age=18;
        stu.name="zhangliying";
        System.out.println(stu.name);
        System.out.println(stu.age);
        //使用对象的成员方法；
        stu.eat();
        stu.sleep();
        stu.study();
    }
}
