//Добавить класс WorkGroup, в который передается массив работников и менеджер.
// Этот класс должен уметь печатать список группы, а также выводить ведомость о зарплате. Посредству класс SalaryCounter.
//  Добавить класс SalaryCounter, в который можно передать, как массив  Employee, так и одиночного Employee. Весь список данных хранится в массиве.
// Должен содержать метод подсчета зарплатной ведомости.



        import java.util.Arrays;
        import java.util.Date;

public class WorkGroup {

    private Employee [] employeesArray;
    private Manager manager;
    private SalaryCounter salaryCounter = new SalaryCounter();

    public WorkGroup(Employee[] employeesArray, Manager manager) {
        this.employeesArray = employeesArray;
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "WorkGroup{" +
                "manager=" + manager +
                ", employeesArray=" + Arrays.toString(employeesArray) +
                '}';
    }

    public void printSalaryInfo() {
        System.out.println("Manager's salary: \n " + salaryCounter.getInfo(this.manager));
        System.out.println("Employees salary: \n" + salaryCounter.getInfo(this.employeesArray));
    }
}

class SalaryCounter {
     String getInfo(Employee employee) {
        String result =  employee.name + " has " + employee.salary + " salary";
        if (employee instanceof Manager) {
            result += " with bonus " + ((Manager) employee).getBonus() + ".";
        } else {
            result += ".";
        }

        return result;
    }

    public String getInfo(Employee[] employees) {
        String result = "";
        for (Employee x :
                employees) {
            result += getInfo(x);
        }

        return result;
    }
}

class Employee {
    protected int inn;
    protected String name;
    protected Date hireDate;
    protected double salary;

    public Employee(int inn, String name, Date hireDate, double salary) {
        this.inn = inn;
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public int getInn() {
        return inn;
    }

    public void setInn(int inn) {
        this.inn = inn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee " + this.name;
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(int inn, String name, Date hireDate, double salary, double bonus) {
        super(inn, name, hireDate, salary);
        this.bonus = bonus;
    }

    public double getBonus() {

        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Manager " + this.name;
    }
}
