package Assignment;

public class Assignment2 {
    public static void main(String[] args) {
//    1. Print unit digit of a number
        int number = 34;
        System.out.println(number%10);
//    2. Print a number without its last digit
        System.out.println(number/10);
//    3. Swapping values of 2 int variable
        int var1 = 12;
        int var2 = 14;

        int temp = var1;
        var1 = var2;
        var2 = temp;

        System.out.println("First variable "+var1);
        System.out.println("Second variable "+var2);
//    4. Swapping without using 3 variable
        int num1 = 24;
        int num2 = 76;

        num2 = num2 + num1;
        num1 = num2 - num1;
        num2 -= num1;

        System.out.println("First number "+num1);
        System.out.println("Second number "+num2);
//    5. Shifting a number by one place in right side

        int shiftNumber = 2563;

        int a = shiftNumber % 10;
        shiftNumber /= 10;

        System.out.println("" + a + shiftNumber);
    }
}
