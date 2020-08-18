package Demo15;

public class Myclass {
    public class myclass{
        public void methodbeat(){
            System.out.println("内部类方法");
            System.out.println("我叫："+name);//可以访问外部类额成员变量
            //定义一个局部内部类，就是在方法内定义一个类，该类不能用修饰符
            class Inner{
                public int num = 1;
            }
            Inner inner = new Inner();
            System.out.println(inner.num);
        }
    }

    private String name;//外部类属性
    public void methodBody(){
        myclass mc = new myclass();
        mc.methodbeat();
        System.out.println("外部类的方法");
    }
}
