package Demo13;

public class Keyboard implements USB{

    public void ON(){
        System.out.println("打开键盘");
    }
    public void OFF(){
        System.out.println("关闭键盘");
    }

    public void Input(){
        System.out.println("键盘输入");
    }
}
