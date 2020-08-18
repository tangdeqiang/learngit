package Demo07Class;

public class Demo07Phone {
    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.brand);
        two.call();
    }
    public static Phone getPhone(){
        Phone one = new Phone();
        one.brand = "pingguo";
        one.price = 8777;
        return one;
    }
}
