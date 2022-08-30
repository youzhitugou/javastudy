package 构造方法;

public class stringDemo {
    public static void main(String[] args){
        //创建一个空白字符串对象，不含任何内容
        String s1 = new String();
        System.out.println("s1:" + s1);

        //根据字符数组的内容，来创建对象
        char[] chs = {'a' ,'b', 'c'};
        String s2 = new String(chs);
        System.out.println("s2: " + s2);

        //根据字节数组的内容，来创建对象
        byte[] bys = {97,98,99};
        String s3 = new String(bys);
        System.out.println("s3: "+ s3);

        //直接赋值的方法创建字符串对象（推荐） 
        String s4 = "abc";
        System.out.println("s4: " + s4);
    }

}
