package Assignment;

class Account{
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public float getBalance() {
        return balance;
    }

    private int accountNumber;
    private String customerName;
    private float balance;

    private static float rateOfInterest;

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }
    public static void setRateOfInterest(float rateOfInterest){
        Account.rateOfInterest = rateOfInterest;
    }

    public void calculateSimpleInterest(int time){
        float simpleInterest;
        simpleInterest = (this.balance * rateOfInterest * time)/100;
        System.out.println("Simple Interest is: "+ simpleInterest);
    }
}



public class Assignment8 {

    static class SuperCar{
        private String ownerName;
        private int price;
        private String colour;
        private String brand;

        public void setSuperCar(String oN, int p, String c, String b){
            this.colour = c;
            this.brand = b;
            this.ownerName = oN;
            this.price = p;
        }

        public String getOwnerName() {
            return ownerName;
        }

        public int getPrice() {
            return price;
        }

        public String getColour() {
            return colour;
        }

        public String getBrand() {
            return brand;
        }
    }
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.setAccountNumber(234);
        a1.setCustomerName("Tushar Tak");
        a1.setBalance(23000);
        Account.setRateOfInterest(1.5f);
        a1.calculateSimpleInterest(2);

    }
}
