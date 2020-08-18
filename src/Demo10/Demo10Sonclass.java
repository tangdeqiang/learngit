package Demo10;

public class Demo10Sonclass extends Demo10Fatherclass {
    int Age = 30;
    public void mathod1(){
        int Age =40;
        System.out.println(Age);//局部变量
        System.out.println(this.Age);//本类的成员变量
        System.out.println(super.Age);//父类的成员变量
    }
    @Override
    public void mathod2(){
        System.out.println("子类方法执行");
    }
}
