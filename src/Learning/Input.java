package Learning;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.print("Enter your name and age: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age=0;
        if(sc.hasNextInt()){
            age = sc.nextInt();
        }
        System.out.println("Name: "+name);
        System.out.println("Age: "+ age);
    }
}
