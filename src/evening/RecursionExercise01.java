package evening;

/**
 * 打印出斐波那契数
 * 第一第二个数是1，从第三个数开始等于前两个数的和
 * author：phil
 */
public class RecursionExercise01 {
    public static void main(String[] args) {
        T t = new T();
        int n = 9;
        int fibonacci = t.fibonacci(n);
        if (fibonacci == -1){
            System.out.println("请输入大于1的整数！！！！！");
        }else{
            System.out.println("该斐波那契数是 "+fibonacci);
        }

    }
    static class T{
        public int fibonacci(int n){
            if (n>=1){
                if (n==1|| n==2){
                    return 1;
                }else{
                    return fibonacci(n-1)+fibonacci(n-2);
                }
            }else{
                return -1;
            }

        }
    }

}
