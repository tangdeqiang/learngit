package Demo10;

import java.util.ArrayList;
import java.util.Random;
public class Member extends Demo10User{
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public  void  receive(ArrayList<Integer> list){
        //从多个红包当中随便抽取一个，给我自己
        //随机获取一个集合当中的索引编号
        int index = new Random().nextInt(list.size());
        int delta = list.remove(index);
        int money = super.getMoney();
        super.setMoney(money+delta);
    }
}
