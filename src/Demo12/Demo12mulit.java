package Demo12;

public class Demo12mulit {
    public static void main(String[] args) {

        methodFu obj = new methodZi();
        obj.method();
        obj.method2();
        //对象的向上转型，就是父类引用指向子类对象，向上转型一定是安全的
        //但是子类自有的方法不能调用，解决办法：对象向下转型
        Animal animal = new Cat();
        animal.eat();


        //对象的向下转型 格式
        //子类名称 对象名 = （子类名称）父类对象
        //含义：将父类对象，【还原】成为本来的子类对象
        Cat cat = (Cat)animal;
//        注意事项
//        a.必须保证对象本来创建的时候，就是猫，已经被当作动物了，还原回来成为本来的猫
//        b.如果对象创建的时候本来就不是猫，现在非要向下转型成为猫，就会出错
        Animal animal1 = new Dog();
   //   Cat cat1 = (Cat)animal1;错误写法  运行会出错java.lang.ClassCastException类转换异常

    }
}
