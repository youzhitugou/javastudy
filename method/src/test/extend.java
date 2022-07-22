package test;

public class extend {
    public static void main(String[] args) {
        Animal a = new Dog();
        Animal b = new Cat();
        a.say();
        b.say();
    }
}
abstract class Animal {
    abstract void say();
}
//猫
class Cat extends Animal{
    public String name="小黑";
    public void say(){
        System.out.println("喵喵喵");
    }
}
//狗
class Dog extends Animal{
    public String name="小白";
    public void say(){
        System.out.println("汪汪汪");
    }
}

