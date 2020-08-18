package Demo10;

import java.util.ArrayList;

public class Manager extends Demo10User {

    public Manager(){
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList send(int totalMoney,int count){
        //首先需要一个集合，用来存储若干个红包
        ArrayList redList = new ArrayList();
        int leftMoney = super.getMoney();
        if(totalMoney>leftMoney){
            System.out.println("余额不足");
            return  redList;
        }
        //扣钱  其实就是从新设置余额
        super.setMoney(leftMoney - totalMoney);

        //发红包需要平均分成count份
        int avg = totalMoney / count;
        int mod = totalMoney % count;//零头
        //剩下的零头包在最后一个红包当中
        //下面把红包一个一个放到集合中
        for (int i = 0; i < count-1; i++) {
            redList.add(avg);
        }
        //最后一个红包
        int last = avg + mod;
        redList.add(last);

        return redList;
    }

}
