package afternoon;

/**
 * 编写一个类MyTools类，编写一个方法可以打印二维数组的数据
 * author：phil
 */
public class MethodExercise04 {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        MyTools myTools = new MyTools();
        myTools.printNum(arr);
    }
    //创建一个类
    static class MyTools{
        public void printNum(int [][] arr){
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j]+"\t");
                }
                System.out.println();//换行
            }
        }
    }
}
