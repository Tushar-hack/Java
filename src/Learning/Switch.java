package Learning;

public class Switch {
    public static void main(String[] args) {
        int x = 20;

        switch (x) {
            case 20:
                System.out.println("Twenty");
                break;

            case 50:
                System.out.println("Fifty");
                break;

            case 0:
                System.out.println("Zero");
                break;

            default:
                System.out.println("Default");
        }
    }
}
