package Demo08;
/*
一个标准的类通常要拥有下面四个组成部分
1，所有的成员变量都要使用private关键字修饰
2，为每一个成员变量编写一堆getter、setter方法
3，编写一个无参数构造方法
4，编写一个全参数构造方法
 */
public class Student {
    private  String  name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*
        public void setName(String name) {
            this.name = name;
        }
        public String getName(){
            return name;
        }

        public void setAge(int age){
            this.age = age;
        }

        public int getAge(){
            return age;
        }
        */
    public Student(){
        System.out.println("无参构造方法调用");
    }
    public Student(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("全参方法调用");
    }


}
