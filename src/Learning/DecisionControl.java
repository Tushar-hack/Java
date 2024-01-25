package Learning;

public class DecisionControl {
    public static void main(String[] args) {

        int age = 50;
        String gender = "FEMALE";

        if(gender == "MALE") {
            System.out.println(age > 50 ? "Ticket price is 10": "Ticket price is 20");
        }else{
            System.out.println(age < 30 ? "Ticket price is 50": "Ticket price is 40");
        }
    }
}
