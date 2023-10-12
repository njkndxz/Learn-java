public class CodeBlocksTest {
    public static void main(String[] args) {
        CodeBlocks cb = new CodeBlocks();
        cb.eat();
    }
}

class CodeBlocks {
    public void eat() {
        System.out.println("eating...");
    }
    //静态代码块，随着类加载而执行，因为类只加载一次，静态代码块也只执行一次
    //可以用了初始化类的信息，内部可以声明变量，调用方法，输出语句等操作
    //静态代码块的执行先于非静态代码块
    //如果声明多个代码块，会按照声明先后顺序执行
    //只能调用静态结构
    static {
        System.out.println("静态代码块");
    }
    //非静态代码块，随着类的对象创建而执行，每创建一次执行一次
    //用来初始化对象信息，内部可以声明变量，调用方法，输出语句等操作
    //如果声明多个代码块，会按照声明先后顺序执行
    //可以调用静态结构和非静态结构
    {
        System.out.println("非静态代码块");
    }
}
