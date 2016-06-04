import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Employee []  employees = {new Employee(122, "Smith", new Date(2014, 9, 24), 2001.30)};

        WorkGroup workGroup = new WorkGroup(employees, new Manager(223, "Brown", new Date(2014, 9, 9), 4000.90, 134.98));
        System.out.println(workGroup.toString());
        workGroup.printSalaryInfo();
    }
}
