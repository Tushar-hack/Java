package Assignment;

// Pattern Problem

public class Assignment6 {
    public static void main(String[] args) {
        f1(); //First Pattern
        f2(); //Second Pattern
    }

    public static void f1() {
        int i,j;
        for(i=0;i<5;i++){
            for(j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void f2() {
        int i,j;
        for(i=5;i>0;i--){
            for(j=0;j<=5;j++){
                if(j>=i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
