package Learning;

public class IterativeControl {
    public static void main(String[] args) {
//        for (int i=1;i<=10;i++) {
//            for (int j=1;j<=5;j++) {
//                if(i+j > 8) {
//                    break;
//                }
//                System.out.println(i+j);
//            }
//        }
//
//        if(2>2) {
//            System.out.println("yes");
//        }


        for(int i=1;i<=4;i++) {
            for(int j=1;j<=5;j++){
                if(j>i)
                    continue;
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
