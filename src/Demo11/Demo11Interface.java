package Demo11;
/*
接口就是多个类的公共规范
接口是一种引用数据类型，最重要的内容就是其中的抽象方法
如何定义一个接口
public interface 接口名称{
    // 接口内容
}

备注：.java--->.class
如果是java7，那么接口中可以包含的内容有
1，常量
2.抽象方法
如果是java8，另外还可以包含
3.默认方法
4.静态方法
如果是java9，还可以包含
5.私有方法

接口使用的步骤：
1.接口不能直接使用，必须有一个实现类来实现该接口
格式：
public class 实现类名称 implement 接口名称{
//.......
}
2.接口的实现类必须覆盖重写（实现）接口中所有的抽象方法
实现：去掉abstract关键字，加上方法体大括号
3.创建实现类的对象，进行使用

阿如果实现类没有完全重写接口中的所有的抽象方法，那这个实现类自己就是抽象类
 */
public class Demo11Interface {
    public static void main(String[] args) {
        //错误使用，不能直接new接口对象使用
//        MyinterfaceAbstract inter = new MyinterfaceAbstract();
        //创建实现类的方法使用
        MyinterfaceAbsimpl impl = new MyinterfaceAbsimpl();
        impl.methodAbs();
        impl.methodAbs2();
    }
}
