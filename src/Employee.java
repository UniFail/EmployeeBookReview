import java.util.Objects;

public class Employee {
    private final String fio;
    private float salary;
    private int department;
    public int id;
    static int counter;

    static {
        counter = 1;
    }

    public Employee(String fio, float salary, int department) {
        this.fio = fio;
        this.salary = salary;
        this.department = department;
        id = counter++;
    }

    public String getFio() {

        return fio;
    }

    public int getDepartment() {

        return department;
    }

    public void setDepartment(int department) {

        this.department = department;
    }

    public float getSalary() {

        return salary;
    }

    public void setSalary(float salary) {

        this.salary = salary;
    }
    public int getId(){
        return this.id++;
    }

    @Override
    public String toString() {
        return
                "\nEmployee " +
                "{fio='" + fio + '\'' +
                ", salary=" + salary +
                ", department=" + department + "} ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Float.compare(employee.salary, salary) == 0 && department == employee.department && id == employee.id && Objects.equals(fio, employee.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, salary, department, id);
    }
}
