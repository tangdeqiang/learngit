package Demo09API;

import java.util.Random;
import java.util.Scanner;

/*
Random类用来生成随机数字，使用起来也是三个步骤
1，导包
improt java.util.Random
2.创建
3，使用
 */
public class Demo09Random {
    public static void main(String[] args) {
        /*
        Random r = new Random();
        int num = r.nextInt(100);
        System.out.println("随机数是"+num);
        //实现1到n的随机数
        int num1 = 1+r.nextInt(1);
        System.out.println("随机数是"+num1);
        */
        Random r = new Random();
        int num = r.nextInt(100);

        int cost =0;
        while (true){
            System.out.println("请从键盘输入你猜测得数：");
            Scanner s = new Scanner(System.in);
            int num1 = s.nextInt();
            if (num1>num){
                System.out.println("你猜测的数字大了，请再猜");
                cost++;
            }else if (num1<num){
                System.out.println("你猜测的数字小了，请再猜");
                cost++;
            }else{
                System.out.println("恭喜！你猜对了");
            }
        }

    }
    //System.out.println();
}