package Demo09API;
import java.util.Scanner;//导包
public class Demo09Scanner {

    public static void main(String[] args) {
        //System.in代表从键盘输入
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("程序是"+num);
        String str = sc.next();
        System.out.println("字符串是"+str);

    }

}
