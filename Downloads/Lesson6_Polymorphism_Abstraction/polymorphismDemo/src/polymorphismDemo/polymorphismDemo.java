
package polymorphismDemo;

// Parent class: a general school employee
class SchoolEmployee {
    protected String name;

    public SchoolEmployee(String name) {
        this.name = name;
    }

    // This method will be overridden by the child classes
    public void doWork() {
        System.out.println(name + " is working in the school.");
    }

    public double computeSalary(int daysWorked) {
        return daysWorked * 500.0; // default daily rate
    }
}

// Child class 1
class Teacher extends SchoolEmployee {
    public Teacher(String name) {
        super(name); // call the parent constructor
    }

    @Override
    public void doWork() {
        System.out.println(name + " (Teacher) explains the lesson and checks the students' quizzes.");
    }

    @Override
    public double computeSalary(int daysWorked) {
        return daysWorked * 1200.0;
    }
}

// Child class 2
class Janitor extends SchoolEmployee {
    public Janitor(String name) {
        super(name);
    }

    @Override
    public void doWork() {
        System.out.println(name + " (Janitor) sweeps the hallways and cleans the classrooms.");
    }

    @Override
    public double computeSalary(int daysWorked) {
        return daysWorked * 600.0;
    }
}

// Child class 3
class SecurityGuard extends SchoolEmployee {
    public SecurityGuard(String name) {
        super(name);
    }

    @Override
    public void doWork() {
        System.out.println(name + " (Security Guard) checks the IDs at the gate.");
    }

    @Override
    public double computeSalary(int daysWorked) {
        return daysWorked * 700.0 + 300.0; // includes night allowance
    }
}

public class polymorphismDemo {
    public static void main(String[] args) {
        // Parent-class references pointing to child objects
        SchoolEmployee emp1 = new SchoolEmployee("Staff Member");
        SchoolEmployee emp2 = new Teacher("Ms. Santos");
        SchoolEmployee emp3 = new Janitor("Mang Pedro");
        SchoolEmployee emp4 = new SecurityGuard("Mr. Reyes");

        System.out.println("=== Same method doWork(), different behavior ===");
        emp1.doWork();
        emp2.doWork();
        emp3.doWork();
        emp4.doWork();

        System.out.println();
        System.out.println("=== Salary for 10 days of work ===");
        SchoolEmployee[] employees = { emp1, emp2, emp3, emp4 };
        for (SchoolEmployee e : employees) {
            System.out.println(e.name + ": PHP " + e.computeSalary(10));
        }
    }
}