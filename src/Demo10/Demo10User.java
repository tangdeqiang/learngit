package Demo10;

public class Demo10User {
    private  String name;
    private  int money;

    public Demo10User() {
    }

    public Demo10User(String name, int money) {
        this.name = name;
        this.money = money;
    }
    //展示一下当前用户有多少钱
    public void show(){
        System.out.println("我叫："+name+",我有多少钱："+money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
