package Learning;

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Employee extends Person {
    private String employeeId;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private double salary;

    public void showEmployee() {
        System.out.println("Name = "+getName());
        System.out.println("Age = "+getAge());
        System.out.println("Employee ID = "+getEmployeeId());
        System.out.println("Salary = "+getSalary());
    }

}
public class Inheritance {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("Tushar Tak");
        e1.setAge(22);
        e1.setSalary(29500);
        e1.setEmployeeId("20EMP100");
        e1.showEmployee();
    }
}
