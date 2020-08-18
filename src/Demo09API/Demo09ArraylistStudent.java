package Demo09API;

import java.util.ArrayList;

public class Demo09ArraylistStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList();

        Student one = new Student("一号", 23);
        Student two = new Student("二号", 25);
        Student three = new Student("三号", 22);
        Student four = new Student("四号", 21);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名是：" + stu.getName() + ",年龄是" + stu.getAge());
        }
    }
}
