package Learning;

class StaticLearn{
    int a = 1,b = 2; // Instance Variable | Non static variable
    static int k = 5; // static variable | Class variable

    void setA(int x) {   //Instance Method
        a=x;
    }

    void setB(int y) {   // Instance Method
        b=y;
    }
    static void setK (int z) {   // Static Method
        k=z;
    }

//    static class Child {
//
//    }
}


public class Static {
    public static void main(String[] args) {
        StaticLearn s1 = new StaticLearn();
        StaticLearn s2 = new StaticLearn();

        s1.setA(12);
        s1.setB(16);
        StaticLearn.setK(100);

        System.out.println("a = " + s1.a + " b = " + s1.b);
        System.out.println("a = " + s2.a + " b = " + s2.b);
        System.out.println("k = " + s1.k);
//        s1.k = 23;
        StaticLearn.k = 23;  //(prefer)
        System.out.println("k = " + s2.k);
    }
}
