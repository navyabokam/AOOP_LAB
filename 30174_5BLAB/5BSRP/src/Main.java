public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John Doe", "Developer");
        Employee employee2 = new Employee("Jane Smith", "Manager");

        SalaryCalculator calculator = new SalaryCalculator();

        System.out.println(employee1.getName() + "'s salary: $" + calculator.calculateSalary(employee1));
        System.out.println(employee2.getName() + "'s salary: $" + calculator.calculateSalary(employee2));
    }
}