package 基础知识练习;
//公鸡5元，母鸡3元，小鸡1/3元，买了一百只鸡共一百元
public class 百钱百鸡 {
    public static void main(String[] args) {
        for (int x = 0; x <= 20; x++) {
            for (int y = 0; y <= 33; y++) {
                int z = 100-x-y;
                if(z%3==0 && 5*x+3*y+z/3==100) {
                    System.out.println("公鸡的个数为：" + x + "只，母鸡的个数为：" + y + "只，小鸡的个数为：" + z + "只");
                }

            }
        }
    }
}
