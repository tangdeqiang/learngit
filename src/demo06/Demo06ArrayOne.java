package demo06;

public class Demo06ArrayOne {
    public  static void main(String[] argv) {
        int[] array = new int[3];
        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println("=========");

        //改变数组中元素的内容
        array[1]=10;
        array[2]=20;
        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
    }
}
