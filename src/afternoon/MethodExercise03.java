package afternoon;

/**
 * 打印指定的行和类的字符
 * author：phil
 */
public class MethodExercise03 {
    public static void main(String[] args) {
        BB b = new BB();
        b.printChar(10,10,'#');
    }

    //创建一个BB类
    static class BB{
        public void printChar(int row,int col,char c){
            for (int i = 0;i < row; i ++){
                for (int j = 0; j < col; j++) {
                    System.out.print(c+"\t");
                }
                System.out.println();//打印好一行就换行
            }
        }
    }
}
