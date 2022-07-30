public class Main {
    public static int id;

    public static void printSeparator() {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
    }

    public static void main(String[] args) {
        EmployeeBook employeesBook = new EmployeeBook();
        employeesBook.addEmployee(new Employee("Elijah Brandon Powell", 100000, 1));
        employeesBook.addEmployee(new Employee("Connor Jake Mitchell", 120000, 2));
        employeesBook.addEmployee(new Employee("Dylan Hunter Lopez", 200000, 3));
        employeesBook.addEmployee(new Employee("Jayden Ashton Martin", 130000, 3));
        employeesBook.addEmployee(new Employee("Sebastian Andrew Cook", 90000, 3));
        employeesBook.addEmployee(new Employee("Leslie Autumn Adams", 150000, 4));
        employeesBook.addEmployee(new Employee("Paige Abigail Barnes", 120000, 4));
        employeesBook.addEmployee(new Employee("Isabella Madeline Ross", 100000, 1));
        employeesBook.addEmployee(new Employee("Arianna Grace Sanders", 135000, 5));
        employeesBook.addEmployee(new Employee("Caroline Arianna Flores", 111000, 5));
        employeesBook.addEmployee(new Employee("Caroline Arianna Flores",130000,2));
        employeesBook.printAllEmployee();
        printSeparator();
        employeesBook.removeEmployee("Arianna Grace Sanders");
        employeesBook.printAllEmployee();
        employeesBook.findEmployee("Leslie Autumn Adams");
    }
}