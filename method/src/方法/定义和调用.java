package 方法;

public class 定义和调用 {
    public static void main(String[] args){
        isEvenNumber();
    }
    public static void isEvenNumber(){
        //定义变量
        int number = 10;
//        number = 9;
        if (number%2 == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }


}
