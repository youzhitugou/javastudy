package 标准类制作;

public class StudentDemo {
    public static void main(String[] args){
        //无参构造方法创建对象后使用setXxx()赋值
        Student s1 = new Student();
        s1.setName("林青霞");
        s1.setAge(30);
        s1.show();

        //使用带参构造方法直接创建带有属性的对象
        Student s2 = new Student("徐长卿",300);
        s2.show();

        System.out.println("hello git");
    }

}
