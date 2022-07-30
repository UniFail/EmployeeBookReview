import java.util.*;

public class EmployeeBook {
    private final Map<String, String> employeeMap = new HashMap<>(Map.of());
    private int size;

    public EmployeeBook() {
        size = 0;
    }

    public void printSeparator() {
        System.out.println("=================================================");
    }

    public void printSeparator2() {
        System.out.println("-------------------------------------------------");
    }


    public void addEmployee(Employee newEmployee) {
        String value = " department = " + newEmployee.getDepartment() +
                ", salary = " + newEmployee.getSalary();
        employeeMap.put(newEmployee.getFio(), value);
    }

    public void printAllEmployee() {
        System.out.println(employeeMap.toString());
    }

    public void removeEmployee(String fioEmployee) {
        employeeMap.remove(fioEmployee);
    }

    public void findEmployee(String fioEmployee){
        if (employeeMap.containsKey(fioEmployee)){
            System.out.println(employeeMap.get(fioEmployee));
        }
        else {
            System.out.println("Employee not found");
        }
    }

}


