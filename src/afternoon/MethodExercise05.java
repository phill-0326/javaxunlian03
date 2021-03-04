package afternoon;

/**
 *  编写一个方法copyPerson，可以复制一个Person对象，返回负值对象。克隆对象
 *  注意要求的到新对象和原来的对象是两个独立的对象，只是他们属性相同。
 *  author：phil
 */
public class MethodExercise05 {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.name = "milan";
        person1.age = 22;
        Copy copy = new Copy();
        Person1 p2 = copy.copyPerson(person1);
        System.out.println(p2.name);
        System.out.println(p2.age);

    }
    public static class Copy{
        public Person1 copyPerson(Person1 person1){
            Person1 p2 = new Person1();
            p2.name=person1.name;
            p2.age = person1.age;
            return p2;

        }
    }
    static class Person1{
        String name;
        int age;
    }
}
