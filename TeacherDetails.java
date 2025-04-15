import java.util.Scanner;

class Employee {
    int Empid;
    String Name;
    double Salary;
    String Address;

    public Employee(int Empid, String Name, double Salary, String Address) {
        this.Empid = Empid;
        this.Name = Name;
        this.Salary = Salary;
        this.Address = Address;
    }
}

class Teacher extends Employee {
    String Department;
    String SubjectsTaught;

    public Teacher(int Empid, String Name, double Salary, String Address, String Department, String SubjectsTaught) {
        super(Empid, Name, Salary, Address); // Call Employee constructor
        this.Department = Department;
        this.SubjectsTaught = SubjectsTaught;
    }

    public void display() {
        System.out.println("Employee ID: " + Empid);
        System.out.println("Name: " + Name);
        System.out.println("Salary: " + Salary);
        System.out.println("Address: " + Address);
        System.out.println("Department: " + Department);
        System.out.println("Subjects Taught: " + SubjectsTaught);
        System.out.println("--------------------------");
    }
}
public class TeacherDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int N = scanner.nextInt();
        scanner.nextLine();

        Teacher[] teachers = new Teacher[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Enter details for Teacher " + (i + 1) + ":");

            System.out.print("Enter Employee ID: ");
            int Empid = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Name: ");
            String Name = scanner.nextLine();

            System.out.print("Enter Salary: ");
            double Salary = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Enter Address: ");
            String Address = scanner.nextLine();

            System.out.print("Enter Department: ");
            String Department = scanner.nextLine();

            System.out.print("Enter Subjects Taught: ");
            String SubjectsTaught = scanner.nextLine();

            teachers[i] = new Teacher(Empid, Name, Salary, Address, Department, SubjectsTaught);
        }
        System.out.println("\nDetails of all teachers:");
        for (Teacher teacher : teachers) {
            teacher.display();
        }

        scanner.close();
    }
}
