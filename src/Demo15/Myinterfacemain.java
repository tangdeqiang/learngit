package Demo15;

public class Myinterfacemain {
    public static void main(String[] args) {
        Myinterface obj = new Interface();//多态写法
        obj.method2();
        //使用匿名类
        Myinterface sub = new Myinterface() {//匿名类
            @Override
            public void method2() {
                System.out.println("匿名类实现了接口的抽象方法");
            }
        };
        System.out.println("=========");
        sub.method2();
    }

}
