package 集合;
import java.util.ArrayList;
public class 构造和添加 {
    public static void main(String[] args) {
        //public ArrayList():创建一个空的集合对象
        ArrayList<String> array = new ArrayList<>();

        System.out.println("array:" + array);

        //public boolean add(E e):将指定元素添加到此集合的末尾
        array.add("我是神");
        array.add("我是鬼");
        array.add("我是什么呢");
        System.out.println("array:" + array);

        //public void add(int index,E e):在指定位置插入指定元素
        array.add(1,"我不是神");
        System.out.println("array:" + array);
    }
}
