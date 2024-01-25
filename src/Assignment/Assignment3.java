package Assignment;

public class Assignment3 {
    public static void main(String[] args) {
//       1. increase the variable from 'A' to 'B'
        char yea = 'A';
        System.out.println(yea);
        yea++;
        System.out.println(yea);
//        2. find the unicode of '+'
        System.out.println((int)'+');

//        3. Make the end digit of a number zero(0)
        int number = 2345;

        number = number /10 * 10;
        System.out.println(number);
//        4. Program to calculate the sum of digits of a number

        int num = 3421;
        int sum = num%10 + num/10%10 + num/100%10 + num/1000;
        System.out.println(sum);
//        5. Character correspond to a unicode

        System.out.println((char)100);

//        6. Reverse 3 digit number
        int x = 135;
        int reverse = x%10*100  +  x/10%10*10  + x/100;
        System.out.println(reverse);
    }
}
