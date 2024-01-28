package Assignment;

class Example{
    private int radius = 5;

    float area() {
        return 3.14f * radius * radius;
    }

    public static void main(String[] args) {
        Example e1 = new Example();
        float area = e1.area();
        System.out.println("Area = " + area);
    }
}


// Guess the output of this program for each variable with explanation
public class FindOutput {
    private int y;
    private static int z;
    public static void main(String[] args) {
        int x;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
}
