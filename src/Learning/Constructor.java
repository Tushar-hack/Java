package Learning;

class Student{
    private String roll_no;
    private String name;
    private String department;
    private int semester;

    public Student() {
        System.out.println("Constructor(without parameter) called.");
    }

    public Student(String roll_no, String name, String department, int semester){
        this.roll_no = roll_no;
        this.name = name;
        this.department = department;
        this.semester = semester;
    }

    public void showDetails() {
        System.out.println("Roll Number: "+ this.roll_no);
        System.out.println("Name: "+this.name);
        System.out.println("Department: "+this.department);
        System.out.println("Semester: "+this.semester);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();

        Student s2 = new Student(
                "20CS100",
                "Tushar Tak",
                "Computer Science",
                7
        );
        s2.showDetails();
    }
}
