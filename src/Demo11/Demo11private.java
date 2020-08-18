package Demo11;
/*
从java9以上版本可以定义私有方法
私有方法主要解决接口中重复代码问题，有两种
1。普通私有方法
2.静态私有方法
私有方法就是本接口中其他方法调用，其他类或者其他接口中不能访问本接口的私有方法，
主要作用就是防止其他地方访问该私有方法引起错误
 */
public interface Demo11private {
    public default void method1(){
        System.out.println("私有方法A");
        method3();
    }
    public default void method2(){
        System.out.println("私有方法B");
        method3();
    }

    //普通私有方法，除了本接口以外不能访问
    private void method3(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }

    //静态私有方法
    public static void method4(){
        System.out.println("静态方法A");
        method6();
    }
    public static void method5(){
        System.out.println("静态方法B");
        method6();
    }

    //普通私有方法，除了本接口以外不能访问
    private static void method6(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
