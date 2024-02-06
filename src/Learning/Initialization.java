package Learning;

public class Initialization {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2,3,4);
        Rectangle r2 = new Rectangle();

        r1.showDimensions();
        System.out.println("R2 Dimensions: ");
        r2.showDimensions();
    }
}

class Rectangle{
    private int length, breadth, height;
    private static int objectCount;

    public Rectangle() {}
    public Rectangle(int l, int b, int h) {
        System.out.println("Before assigning values: ");
        System.out.println("Length = "+length);
        System.out.println("Breadth = "+breadth);
        System.out.println("Height = "+height);
        length = l;
        breadth = b;
        height = h;
    }
    {
        length = 6;
        breadth = 6;
        height = 6;
    }
    static {
        objectCount = 10;
        // Class specific work should be done here
    }

    public void showDimensions() {
        System.out.println("Length = "+length);
        System.out.println("Breadth = "+breadth);
        System.out.println("Height = "+height);
    }

    public void setDimensions(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }
}