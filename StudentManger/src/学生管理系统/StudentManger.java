package 学生管理系统;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManger {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("------欢迎来到学生管理系统------");
            System.out.println("1 添加学生信息");
            System.out.println("2 删除学生信息");
            System.out.println("3 查看学生信息");
            System.out.println("4 修改学生信息");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addStudent(array);
                    break;
                case 2:
                    deleteStudent(array);
                    break;
                case 3:
                    findStudent(array);
                    break;
                case 4:
                    updateStudent(array);
                    break;
                default:
                    break;
            }
        }while(choice != 5);

    }

    //定义一个方法，用于添加学生信息
    public static void addStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生学号：");
        String sid = sc.nextLine();
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生地址：");
        String address = sc.nextLine();

        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        array.add(s);
        System.out.println("添加学生成功");
    }

    //定义一个方法，用于查看学生信息
    public static void findStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("查看全部信息请输入1，查看单人信息请输入2,退出请输入3");
            int x = sc.nextInt();
            if(x == 1){
                for (int i = 0; i < array.size(); i++) {
                    Student s = array.get(i);
                    System.out.println("学号：" + s.getSid());
                    System.out.println("姓名：" + s.getName());
                    System.out.println("年龄：" + s.getAge());
                    System.out.println("地址：" + s.getAddress());
                }
            }else if (x == 2){
                System.out.println("请输入查看学生的信息：");
                String s = sc.nextLine();
                int index = array.indexOf(s);
                if(index>0 && index<array.size()) {
                    Student s1 = array.get(index);
                    System.out.println("学号：" + s1.getSid());
                    System.out.println("姓名：" + s1.getName());
                    System.out.println("年龄：" + s1.getAge());
                    System.out.println("地址：" + s1.getAddress());
                }else{
                    System.out.println("无该学生信息");
                }

            }else{
                break;
            }
        }
    }

    //定义一个方法，用于删除学生信息
    public static void deleteStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        int x;
        do {
            System.out.println("请输入删除学生的信息：");
            String s = sc.nextLine();
            int index = array.lastIndexOf(s);
            array.remove(index);
            System.out.println("删除学生成功");
            System.out.println("继续删除请输入1,退出请输入0");
            x = sc.nextInt();
        }while(x == 1);
    }

    // 定义一个方法，用于修改学生信息
    public static void updateStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        int x;
        do {
            System.out.println("请输入修改学生的信息：");
            String student = sc.nextLine();
            int index = array.lastIndexOf(student);
            System.out.println("请输入学生学号：");
            String sid = sc.nextLine();
            System.out.println("请输入学生姓名：");
            String name = sc.nextLine();
            System.out.println("请输入学生年龄：");
            String age = sc.nextLine();
            System.out.println("请输入学生地址：");
            String address = sc.nextLine();
            Student s = new Student();
            s.setSid(sid);
            s.setName(name);
            s.setAge(age);
            s.setAddress(address);

            array.set(index, s);

            System.out.println("信息修改成功");
            System.out.println("继续修改请输入1,退出请输入0");
            x = sc.nextInt();
        } while (x == 1);
    }
}

