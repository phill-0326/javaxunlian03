package afternoon;

/**
 * 判断一个数是奇数还是偶数，返回boolean值
 * author：phil
 */

public class MethodExercise02 {
    public static void main(String[] args) {
        AA1 a = new AA1();
        if(a.isOdd(1)){
            System.out.println("是欧数");
        }else{
            System.out.println("是奇数");
        }
    }
    //创建一个类AA
    static class AA1{
        public boolean isOdd(int num){
          /*  if(num % 2 ==0){
                return false;
            }else {
                return true;
            }*/

            //三元运算符
           // return num % 2 == 0 ? true : false;
            //直接返回
            return num % 2 ==0;
        }
    }
}
