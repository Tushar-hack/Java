package Learning;


// After Compiling this code there will be 2 .class file.
class Box {
    int length, breadth, height;

    void setDimension(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    void showDimension() {
        System.out.println("Length is " + length);
        System.out.println("Breadth is " + breadth);
        System.out.println("Height is " + height);
    }
}

public class ClassesAndObjects {
    public static void main(String[] args) {
        Box v1 = new Box();

        v1.setDimension(12,13,14);

        v1.showDimension();
    }
}

// We can also do like this, but we need to change the name of the class.
// After Compiling there will be only one .class file.
//class Box{
//    int length, breadth, height;
//
//    void setDimension(int l, int b, int h) {
//        length = l;
//        breadth = b;
//        height = h;
//    }
//    void showDimension() {
//        System.out.println("Length is " + length);
//        System.out.println("Breadth is " + breadth);
//        System.out.println("Height is " + height);
//    }
//
//    public static void main(String[] args) {
//        Box b1 = new Box();
//    }
//}
