package Demo14;
/*
final修饰一个类的时候，格式：
public final class 类名称{
//.....
}
含义：当前这个类不能有任何子类，（太监类），内容没有任何影响
不能对里面所有的方法覆盖重写，
可以对final的父类的方法进行覆盖重写
 */
public final class MyFinal {
    public void method(){
        System.out.println("方法");
    }
    /*
    对于成员变量来说，如果使用final关键字修饰，那么这个变量也照样不可变，
    1.由于成员变量有默认值，所以用了final之后必须手动赋值，不会再给默认值了
    2.对于final的成员变量，要么使用直接赋值，要么用够构造方法赋值，二者选其一
    3.必须保证类当中所有重载的构造方法，都最终会对final的成员变量进行赋值

     */
}
