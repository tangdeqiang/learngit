package Demo10;

/*
如何使用抽象类和抽象方法
1.不能直接创建new抽象类对象
2.必须用一个子类继承抽象父类
3.子类必须覆盖重写抽象父类当中所有的抽象方法。
覆盖重写（实现）,子类去掉抽象方法的abstract关键字，然后补上方法体大括号
4.创建子类对象进行使用
 */
//抽象类也必须用abstract修饰
public abstract class Demo10Abstract {
    //抽象方法的定义，抽象方法所在的类必须是抽象类，抽象类也得用abstract修饰
    public abstract void eat();
    //抽闲类中也可以定义普通的方法
    public void mathod(){
        System.out.println("抽象类");
    }
}
