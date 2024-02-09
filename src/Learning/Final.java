package Learning;
//final class
final class SDE{
    // final instance variable
    public final int salary;
    private int designation;
    // final static instance variable
    public static final int MANAGER=1;
    public static final int ACCOUNTANT=2;
    public static final int CASHIER=3;


    public SDE(int salary){
        this.salary = salary;
    }

    public void setDesignation(int designationNumber){
        this.designation = designationNumber;
    }

    public void f1() {
        int a; // Local variable
        final int b; // Final local variable
    }
}

//class Intern extends SDE {} SDE cannot be extended as its final

public class Final {
    public static void main(String[] args) {
        // final local variable
        final int number = 23;

//        number = 34; this line will give error
        SDE s1 = new SDE(45000);
        s1.setDesignation(SDE.CASHIER);
    }
}

// final method example

class T{
    public final void f1() {
        System.out.println("Parent class final function");
    }
}

class P extends T{
//    public void f1() {} this will give error
}