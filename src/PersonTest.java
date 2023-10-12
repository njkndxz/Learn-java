public class PersonTest {
    public static void main(String[] args) {
        Man m1 = new Man("alan", 22, "man");
        m1.say();
        Person p1 = new Man("ally", 23, "man");
        p1.say();
//        p1.hello(); //父类不能直接调用子类特有的方法和属性
//       ((Man) p1).hello(); //必须强制转型

//        if(p1 instanceof  Man) {
//            Woman m2 = (Woman)p1;   //会报错，因为Man和Woman是不同类型的
//            m2.hi();
//        }
        if(p1 instanceof  Man) {
            Man m2 = (Man)p1;   //正确，转成相同类型的
            m2.hello();
        }

    }

}
