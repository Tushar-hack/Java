package Assignment;

class Complex{
    private int real;
    private int imaginary;

    public void setComplex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void showComplex() {
        System.out.println(this.real +" + "+this.imaginary+"i");
    }

}

class Time{
    private int hour;
    private int minutes;
    private int seconds;

    public void setTime(int hr, int min, int sec){
        this.hour = hr;
        this.minutes = min;
        this.seconds = sec;
    }

    public void showTime() {
        System.out.println(this.hour+" hr "+this.minutes+" min "+ this.seconds+" sec ");
    }
}

class Cuboid{
    private int length;
    private int breadth;
    private int height;

    public void setDimension(int l, int b, int h){
        this.length = l;
        this.breadth = b;
        this.height = h;
    }
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public void volume(){
        System.out.println(this.breadth * this.height * this.length);
    }

    public void surfaceArea() {
        System.out.println(2* ((this.length * this.breadth)+(this.breadth*this.height)+ (this.height*this.length)));
    }
}

class Employee{
    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void showDetails(){
        System.out.println("Employee ID: "+ this.empID);
        System.out.println("Name: "+this.name);
        System.out.println("Salary: "+this.salary);
    }
    private int empID;
    private String name;
    private int salary;


}

class Distance {
    private int km;
    private int m;
    private int cm;


    public void setKm(int km) {
        this.km = km;
    }


    public void setM(int m) {
        this.m = m;
    }


    public void setCm(int cm) {
        this.cm = cm;
    }

    public void addDistance(String s1, String s2){
        if(s1 == "km" && s2 == "m"){
            System.out.println((this.km*1000) + (this.m));
        }
        if(s1 == "km" && s2 == "cm"){
            System.out.println((this.km * 100000)+ (this.cm));
        }
    }
}

public class Assignment7 {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        c1.setComplex(3,4);
        c1.showComplex();

        Time t1 = new Time();
        t1.setTime(11,37,23);
        t1.showTime();

        Cuboid c2 = new Cuboid();
//        c2.setBreadth(2);
//        c2.setHeight(8);
//        c2.setLength(5);
        c2.setDimension(5,2,8);
        int breadth = c2.getBreadth();
        System.out.println(breadth);
        c2.volume();
        c2.surfaceArea();

        Employee e1 = new Employee();
        e1.setEmpID(23);
        e1.setName("Tushar");
        e1.setSalary(29500);
        e1.showDetails();
    }
}
