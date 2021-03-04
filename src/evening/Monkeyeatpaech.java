package evening;

/**
 * 猴子吃桃的问题：有一堆的桃子猴子每天吃掉一半在多吃一个，吃到第十天的时候（还没有吃）还剩1个，
 * 问在第几天有几个桃子？运用递归的思想做！！！
 * author：phil
 */
public class Monkeyeatpaech {
    public static void main(String[] args) {
        T t = new T();
        int day = 4;
        int num = t.peach(day);
        if (num==-1){
            System.out.println("您输入的"+day+"不在1-10天的范围内！！！！");
        }else{
            System.out.println("在第"+day+"天的时候有"+num+"个桃子！！！");
        }
    }
    static class T{
        public int peach(int day){
            if (day == 10){
                return 1;
            }else if (day >=1 && day<=9){
                return (peach(day +1)+1)*2;
            }else{
               // System.out.println("请输入1-10的范围：");
                return -1;
            }
        }
    }
}
