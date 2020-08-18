package demo06;
/*
如何获取数组的长度，格式
数组名称.length
这将会得到一个int的数字，代表数组的长度
数组在程序运行期间，长度不可改变
 */
public class Demo06Arraylength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];
        int[] arrayB = {10,20,304,2,23,24,4,65,34,23,56,4,23};
        int len = arrayB.length;
        System.out.println("数组的长度是"+len);
        for(int i=0;i<5;i++){
            System.out.println(arrayB[i]);
        }
        System.out.println("=========");
        for(int i=0;i<arrayB.length;i++){
            System.out.println(arrayB[i]);
        }
    }
}
