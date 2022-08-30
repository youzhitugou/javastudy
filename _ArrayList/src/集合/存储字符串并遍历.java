package 集合;
import java.util.ArrayList;
public class 存储字符串并遍历 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("霍雨浩");
        array.add("王冬儿");
        array.add("马小桃");

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }


    }


}
