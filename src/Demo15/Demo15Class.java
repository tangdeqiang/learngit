package Demo15;

public class Demo15Class {
    public static void main(String[] args) {
        Myclass My = new Myclass();
        My.methodBody();//内部类的间接访问方式
        System.out.println("========");
        Myclass.myclass Mm = new Myclass().new myclass();//new内部类的对象
        Mm.methodbeat();//访问内部类的方法，内部类的直接访问方式
    }
}
