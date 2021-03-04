package Morning;

/**
 * 方法调用的小练习
 * author：phil
 */
public class Method01 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.speak();
        p1.cal01();
        p1.cal02(66);//在调用cal02方法的时候给定一个int类型的整数
       int returnRes= p1.getSum(11,22);//在调用getSum方法时设置两个数然后在相加会返回一个值33
        System.out.println("getSum返回的值是："+returnRes);

    }
     static class Person{
        String name;
        int age;
         public void speak(){
             System.out.println("我是一个大好人！！！ ");
         }
         public void cal01(){
             //设计一个方法计算1-100的和
             int sum = 0;
             for (int i = 0; i <= 100; i++) {
                 sum += i;
             }
             System.out.println("cal01方法 结果为：" + sum);
         }
         //设计一个方法可以计算1-n的和
         public void cal02(int n){
             int sum = 0;
             for (int i = 0; i <= n; i++) {
                 sum += i;
             }
             System.out.println("cal02方法 结果为：" + sum);
         }
         //设计一个方法getSum得到两个数字的和
         public int getSum(int num1,int num2){
             int res = num1+num2;
             return res;//将的到的res返回
         }




    }

}
