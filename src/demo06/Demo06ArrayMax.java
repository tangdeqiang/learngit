package demo06;

public class Demo06ArrayMax {
    public static void main(String[] args) {
        int[] array = {5,15,20,30,10000};
        int Max = array[0];
        int Min = array[0];
        for(int i=0;i<array.length;i++){
//            如果当前元素比max更大，则换入
            if(array[i]>Max){
                Max=array[i];
            }
        }
        System.out.println("最大值"+Max);
        for(int i=0;i<array.length;i++){
//            如果当前元素比max更小，则换入
            if(array[i]<Min){
                Min=array[i];
            }
        }
        System.out.println("最小值"+Min);
    }
}
