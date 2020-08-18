package Demo14;
/*
final代表最终的，不可变的，有四种用法
1.可以修饰一个类
2.可以修饰一个方法
3.可以修饰一个局部变量
4.可以修饰一个成员变量
 */
public class Demo14Final {
//final  修饰方法

    public final void method1(){
        System.out.println("父类方法执行");
        int num1=10;
        System.out.println("num1");
        num1 = 20;
        final int num2 = 30;
        /*
        一旦使用final用来修饰局部变量，那么这个变量就不能再改变，一次赋值，终生不变
        只要保证有一次赋值即可
        对于基本类型来说，不可变说的是变量中的数据不可改变
        对于引用类型来说，不可变说的是引用类型中的地址不可变
         */
    }
}
/*
当final修饰一个方法时，这个方法就是最终方法，也就是不能覆盖重写
格式：
修饰符  final 返回值类型  方法名称（参数列表）{方法体}

 */