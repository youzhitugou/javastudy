package 存储学生对象并遍历;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();

        Student s1 = new Student("高鹏",30);
        Student s2 = new Student("许嵩",40);
        Student s3 = new Student("林俊杰",42);

        array.add(s1);
        array.add(s2);
        array.add(s3);

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
