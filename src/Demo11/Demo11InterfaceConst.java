package Demo11;
/*
接口当中也可以定义成员变量，但是必须使用public static final 三个关键字修饰
三个关键字可以省略，但是省略了系统也默认有这三个关键字
并且成员变量名称必须要大写，单词之间必须使用下划线连接，
接口当中成员变量的值必须赋值，赋值之后就不能改变了
一旦使用final关键词修饰就是不可变，任何手段都不能改变
 */
public interface Demo11InterfaceConst {
    public static final int NUM = 19;
}
