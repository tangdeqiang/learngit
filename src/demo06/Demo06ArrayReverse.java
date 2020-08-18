package demo06;

public class Demo06ArrayReverse {
    public static void main(String[] args) {
        int[] array = {5,15,20,30,10000,80};
//        int Min = array[0];
//        int Max = array[array.length-1];

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("=======");
        /*
        初始化语句
        条件判断
        步进表达式
         */
        for(int Min = 0,Max = array.length-1;Min<Max;Min++,Max--){
            int temp = array[Min];
            array[Min] = array[Max];
            array[Max] = temp;
        }
        System.out.println("=========");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
