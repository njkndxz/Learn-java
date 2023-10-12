public class Man extends Person {
    String sex;
    public Man(String name, int age, String sex) {
        super(name, age);
        this.sex = sex;
    }
    public void hello() {
        System.out.println("hello, fuck!");
    }
    @Override
    public void say() {
        super.say();
        System.out.println(super.name + super.age + sex);
    }
}
