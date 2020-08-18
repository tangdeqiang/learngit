package Demo10;
/*
重写：
方法的名称一样，参数列表不一样，覆盖，覆写
重载：
方法的名称一样，参数列表不一样

重写的特点
创建的是子类对象，则优先使用子类方法。
重写的注意：
父类和子类的方法名称和参数都要一样，
@override检测重写的方法是否有效
Object类似所有类的公共类，祖宗类
子类方法的返回值必须小于等于父类方法的返回值范围
子类方法的权限必须
大于等于父类方法的权限修饰符
小扩展提示：public >protected>defoult>private

super的三种用法
1.在子类的成员方法中，访问父类的成员变量
2.在子类的成员方法中，访问父类的成员方法
3，在子类的构造方法，访问父类的成员方法


super关键字用来访问父类内容，而this关键字用来访问本类内容，
this的三种方法
1.在本类的成员方法中，访问本类的成员变量
2.在本类的成员方法中，访问本类的另一个成员方法
3.在本类的构造方法中，访问本类的另一个构造方法
在第三种方法使用中，注意；
this（...）调用也必须是构造方法的第一个语句，唯一一个
super和this两种构造调用，不能同时使用

1,Java语言是单继承的
2,一个类的直接父类只有一个
Java语言可以多级继承
class B extends A{}；
class C extends B{};
3,一个子类的直接父类是唯一的，但是一个父类可以拥有很多个子类，
也可以有很多兄弟姐妹，

 */
public class Demo10Main {
    public static void main(String[] args) {
        Demo10Sonclass son = new Demo10Sonclass();
        son.mathod();
        son.mathod1();
        son.mathod2();//这里创建的对象是子类，所以调用子类的方法
        Demo10Fatherclass fu = new Demo10Fatherclass();
        fu.mathod2();//当重名的时候创建的对象是谁，就调用谁的方法，这里
        //创建的对象是父类，所以调用父类的方法，
        //抽象父类中再子类中实现抽象方法调用
        Cat cat = new Cat();
        cat.eat();
        cat.mathod();
        //以下代码实现java的拆箱装箱
        int i0=10;
        int i1=10;
        int i2=500;
        int i3=500;
        Integer i4=new Integer(10);
        Integer i5=new Integer(10);
        Integer i6=new Integer(500);
        Integer i7=new Integer(500);
        System.out.println("i0==i1?  "+(i0==i1));//比较的是数据
        System.out.println("i2==i3?  "+(i2==i3));
        System.out.println("i4==i5?  "+(i4==i5));//比较的时数据的地址
        System.out.println("i6==i7?  "+(i6==i7));//比较的是数据的地址
        System.out.println("i0==i4?  "+(i0==i4));//自动拆箱和装箱功能，比较的数据
    }

}
