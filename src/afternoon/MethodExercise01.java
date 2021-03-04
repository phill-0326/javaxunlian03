package afternoon;

import java.util.Scanner;

/**
 * 编写类AA，有一个方法：判断一个数是奇数odd还是偶数，返回boolen
 * 此方法比较的灵活一些
 */
public class MethodExercise01 {
    public static void main(String[] args) {
       AA a = new AA();
       if (a.panduan()){
           System.out.println("是偶数");
       }else{
           System.out.println("是奇数");
       }
    }
    static class AA{
        public boolean panduan(){
            Scanner myScaner = new Scanner(System.in);
            System.out.println("请输入一个数： ");
            int num = myScaner.nextInt();
            return num % 2 == 0;
        }
    }
}
