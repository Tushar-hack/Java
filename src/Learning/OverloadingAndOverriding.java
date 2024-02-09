package Learning;

class A {
    public void f1() {
        System.out.println("Parent class");
    }
    public void overriding() {
        System.out.println("Class A Override Method");
    }

}

class B extends A{
    public void f1(int a){
        System.out.println("Child class number "+a);
    }
    public void overriding() {
        System.out.println("Class B Override Method");
    }
}

public class OverloadingAndOverriding {
    public static void main(String[] args) {
        B b = new B();
        b.f1();
        b.f1(1);

        A a = new A();

        b.overriding();
        a.overriding();
    }
}
