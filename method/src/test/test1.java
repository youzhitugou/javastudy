package test;

public class test1 {

    class Dogs{
        private String name;  //名字
        private String age;   //年龄

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }
    }



    class animal{
        public String name = "小白";
        public int age = 2;
        public void say(){
        }
    }

    class dog extends animal {
        //重载 改变参数
        public void say(String name) {
            System.out.println(name+"汪汪汪");
        }

        //重载 改变参数+返回值
        public int say(int age) {
            System.out.println("汪汪汪"+age);
            return age;
        }
    }






}
